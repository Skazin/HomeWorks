package HomeWork6;

import HomeWork5.EasySearch;
import HomeWork5.ISearchEngine;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class HomeWork6 {
    public static void main(String[] args) {

        String fileSeparator = File.separator;
        File fileName = new File("HomeWork" + fileSeparator + "resources" + fileSeparator + "Война и мир_книга.txt");

        EasySearch easySearch = new EasySearch();
        String stringText = fileToString(fileName);
        String stringTextInLowerCase = stringText.toLowerCase();

        /*делим текст на сегменты*/
        String segment1 = stringText.substring(0, 632_677);
        String segment2 = stringText.substring(632_678, 1_265_345);
        String segment3 = stringText.substring(1_265_346, 1_898_053);

        String segment1InLowerCase = segment1.toLowerCase();
        String segment2InLowerCase = segment2.toLowerCase();
        String segment3InLowerCase = segment3.toLowerCase();
        String[] bunchOfSegments = {segment1InLowerCase, segment2InLowerCase, segment3InLowerCase};
        String[] wordsForSearch = {"война", "и", "мир"};

        System.out.println("Слово \"война\" встречается " + easySearch.search(stringTextInLowerCase, "война") + " раза");
        System.out.println("Слово \"и\" встречается " + easySearch.search(stringTextInLowerCase, "и") + " раза");
        System.out.println("Слово \"мир\" встречается " + easySearch.search(stringTextInLowerCase, "мир") + " раз");


        Callable<Long> task;
        long counter = 0l;
        ISearchEngine searchEngine = new EasySearch();

        try{
            task = new Task (searchEngine, segment1InLowerCase, "война");
            counter = task.call();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("С помощью потока");
        System.out.println("В сегменте №1 слово \"война\" встречается " + counter + " раз");

        try {
            task = () -> searchEngine.search(segment2InLowerCase, "война");
            counter = task.call();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("С помощью лябды");
        System.out.println("В сегменте №2 слово \"война\" встречается " + counter + " раз");

        System.out.println("С помощью ExecutorService");
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);
        Future<Long> future1;
        Future<Long> future2;
        Future<Long> future3;
        Long frequency1 = 0l;
        Long frequency2 = 0l;
        Long frequency3 = 0l;


        try {
            for (int i = 0; i < wordsForSearch.length; i++) {
                future1 = executor.submit(new Task(searchEngine, bunchOfSegments[i], wordsForSearch[0]));
                future2 = executor.submit(new Task(searchEngine, bunchOfSegments[i], wordsForSearch[1]));
                future3 = executor.submit(new Task(searchEngine, bunchOfSegments[i], wordsForSearch[2]));
                frequency1 += future1.get();
                frequency2 += future2.get();
                frequency3 += future3.get();

            }
            executor.shutdown();
            System.out.println("Слово \"война\" встречается " + frequency1 + " раза");
            System.out.println("Слово \"и\" встречается " + frequency2 + " раза");
            System.out.println("Слово \"мир\" встречается " + frequency3 + " раз");
        }catch (RejectedExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод удалялет из текста знаки препинания
     * @param line передаваемый текст
     * @return обработанный текст
     */
    public static String erasePunctuation (String line){
        char[] punctuation = {',', '-', ';', '.', ':', '"', '(', ')', '!', '?'};
        for (char i : punctuation) {
            line = line.replace(i, ' ');
        }
        return line;
    }

    public static String fileToString (File file){
        StringBuilder stringBuilder = new StringBuilder();
        try(FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){
                stringBuilder.append(line);
            }
            fileReader.close();

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e){
            System.out.println("Произошла ошибка ввода/вывода");
        }
        return stringBuilder.toString();
    }
}
