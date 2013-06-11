package bz.tsung.android.dictionaryhub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;

import bz.tsung.android.dictionaryhub.dictionary.DictionaryFactory;

/**
 * Created by tsung on 13-6-7.
 */
public class TextHubReceiver extends BroadcastReceiver {
    private static final String TAG = "TextHubReceiver";
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: " + intent);

        //get selection
        String selection = intent.getStringExtra("bz.tsung.android.texthub.EXTRA_TEXT");
        Log.i(TAG, "onReceive selection: " + selection);

        String keyPref = context.getString(R.string.pref_key_choose_dictionary);
        String defaultDictionary = context.getString(R.string.item_dictionary_default);
        String dictionary = PreferenceManager.getDefaultSharedPreferences(context).getString(keyPref, defaultDictionary);

        String url = DictionaryFactory.getInstance(context, dictionary).search(selection);
        Uri uri = Uri.parse(url);
        Intent i = new Intent();
        i.setData(uri);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
