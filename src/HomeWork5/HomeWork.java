package HomeWork5;


import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

public class HomeWork {
    public static void main(String[] args) {

        String fileSeparator = File.separator;
        File fileName = new File("HomeWork" + fileSeparator + "resources" + fileSeparator + "Война и мир_книга.txt");

        Set<String> setText = uniqueWords(fileName);
        System.out.println("Уникальных слов: " + setText.size());
        Map<String, Integer> mapText = wordsForCount(fileName);
        Map<Integer, StringBuilder> topWords = wordsForTop(mapText);
        int place = 1;
        int count = 1;
        for (int i  : topWords.keySet()) {
            System.out.println("Позиция № " + place + ": " + topWords.get(i) + " - " + i + " раз");
            ++place;
            ++count;
            if(count == 11) break;
        }

        EasySearch easySearch = new EasySearch();
        String stringText = fileToString(fileName);
        String stringTextInLowerCase = stringText.toLowerCase();


        System.out.println("Слово \"война\" встречается " + easySearch.search(stringTextInLowerCase, "война") + " раза");
        System.out.println("Слово \"и\" встречается " + easySearch.search(stringTextInLowerCase, "и") + " раза");
        System.out.println("Слово \"мир\" встречается " + easySearch.search(stringTextInLowerCase, "мир") + " раз");
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

    /**
     * Метод позволяет отсеить уникальные слова и собрать их в коллецию
     * @param file имя текстового файла
     * @return коллекцию Set, содержащую уникальные слова
     */
    public static Set<String> uniqueWords (File file){
        Set<String> uWords = new LinkedHashSet<>();
        String emptyString = new String();
        String doubleDash = "--";
        try(FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){
                line = erasePunctuation(line);
                String[] words = line.split("\\s");
                for (String word : words)
                    if(!emptyString.equals(word) && !doubleDash.equals(word))uWords.add(line);
            }
            fileReader.close();

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e){
            System.out.println("Произошла ошибка ввода/вывода");
        }
        return uWords;
    }

    /**
     * Метод создает коллекцию Map <Слово, кол-во раз, которое оно встречается в тексте> из слов текстового файла
     * @param file передаваемый текстовый файл
     * @return коллекция Map
     */
    public static Map<String, Integer> wordsForCount(File file){
        Map<String, Integer> wordsInMap = new HashMap<>();
        String emptyString = new String();
        String doubleDash = "--";
        try(FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){
                line = erasePunctuation(line);
                String[] words = line.split("\\s");
                for (String word : words)
                    if(!emptyString.equals(word) && !doubleDash.equals(word)){
                    if (wordsInMap.containsKey(word)) {
                        wordsInMap.put(word, wordsInMap.get(word) + 1);
                    } else {
                        wordsInMap.put(word, 1);
                    }
                }
            }

            fileReader.close();

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e){
            System.out.println("Произошла ошибка ввода/вывода");
        }
        return wordsInMap;
    }

    /**
     * Метод создает коллекцию Map, которая поможет установить топ10 слов из текстового файла
     * @param wordsMap коллекция Map <Слово, кол-во раз, которое оно встречается в тексте> из слов текстового файла
     * @return коллекцию Map
     */
    public static Map<Integer, StringBuilder> wordsForTop(Map<String, Integer> wordsMap){
        Map<Integer, StringBuilder> topWords = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int amount;
        for (String word: wordsMap.keySet()) {
            amount = wordsMap.get(word);
            if(topWords.containsKey(amount)) {
                topWords.put(amount, topWords.get(amount).append(", ").append(word));
            } else {
                topWords.put(amount, new StringBuilder(word));
            }
        }
        return topWords;

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

