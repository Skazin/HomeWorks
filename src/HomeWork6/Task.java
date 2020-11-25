package HomeWork6;

import HomeWork5.ISearchEngine;

import java.util.concurrent.Callable;

public class Task  implements Callable<Long>  {

    private ISearchEngine searchEngine;
    private String text;
    private String word;

    public Task (ISearchEngine searchEngine, String text, String word) {
        this.searchEngine = searchEngine;
        this.text = text;
        this.word = word;
    }


    public Long call () throws Exception{
        return this.searchEngine.search(text, word);
    }
}
