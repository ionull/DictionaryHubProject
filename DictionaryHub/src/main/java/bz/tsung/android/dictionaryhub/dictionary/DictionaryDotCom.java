package bz.tsung.android.dictionaryhub.dictionary;

/**
 * Created by tsung on 13-6-11.
 */
public class DictionaryDotCom implements Dictionary {
    @Override
    public String search(String word) {
        return "http://dictionary.reference.com/browse/" + word;
    }
}
