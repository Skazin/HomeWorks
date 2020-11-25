package HomeWork5;

public class EasySearch implements ISearchEngine {

    public long search (String text, String word){


        word = String.format(" %s ", word);
        long counter = 0L;
        int i = 0;

        while ((i = text.indexOf(word, i)) != -1){
            i++;
            counter++;
        }
        return counter;
    }
}
