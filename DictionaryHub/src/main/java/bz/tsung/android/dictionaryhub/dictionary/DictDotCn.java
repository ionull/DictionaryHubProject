package bz.tsung.android.dictionaryhub.dictionary;

/**
 * Created by tsung on 13-6-11.
 */
public class DictDotCn implements Dictionary{
    @Override
    public String search(String word) {
        return "http://dict.cn/" + word;
    }
}
