package HomeWork5;


import java.io.*;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

        String fileName = "Война и мир_книга.txt";

        Set<String> setText = uniqueWords(fileName);
//        System.out.println(setText.size());
        Map<String, Integer> mapText = wordsForCount(fileName);
    }

    /**
     * Метод удалялет из текста знаки препинания
     * @param line передаваемый текст
     * @return обработанный текст
     */
    public static String erasePunctuation (String line){
        char[] punctuation = {',', '-', ';', '.', ':', '"', '(', ')', '!', '?'};
        for (char i : punctuation) {
            line.replace(i, ' ');
        }
        return line;
    }

    /**
     * Метод позволяет отсеить уникальные слова и собрать их в коллецию
     * @param file имя текстового файла
     * @return коллекцию Set, содержащую уникальные слова
     */
    public static Set<String> uniqueWords (String file){
        Set<String> uWords = new LinkedHashSet<>();
        String emptyString = new String();
        try(FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){
                line = erasePunctuation(line);
                String[] words = line.split("\\s");
                for (String word : words)
                if(!emptyString.equals(word))uWords.add(line);
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
    public static Map<String, Integer> wordsForCount(String file){
        Map<String, Integer> wordsInMap = new HashMap<>();
        String emptyString = new String();
        try(FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){
                line = erasePunctuation(line);
                String[] words = line.split("\\s");
                for (String word : words)
                    if(!emptyString.equals(word)){
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
}
