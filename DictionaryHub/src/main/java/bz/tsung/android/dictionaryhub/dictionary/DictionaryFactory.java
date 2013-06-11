package bz.tsung.android.dictionaryhub.dictionary;

import android.content.Context;

import bz.tsung.android.dictionaryhub.R;

/**
 * Created by tsung on 13-6-11.
 */
public class DictionaryFactory {
    public static Dictionary getInstance(Context context, String engine) {
        //String defaultDictionary = context.getString(R.string.item_dictionary_default);
        if(context.getString(R.string.item_dictionary_dot_com).equals(engine)) {
            return new DictionaryDotCom();
        } else if(context.getString(R.string.item_dict_dot_cn).equals(engine)) {
            return new DictDotCn();
        } else {
            //default
            return new DictionaryDotCom();
        }
    }
}
