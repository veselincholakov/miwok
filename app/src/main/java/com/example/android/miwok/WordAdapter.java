package com.example.android.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Veselin.Cholakov on 15.2.2017 г..
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.simple_layout_custom, null);
        }

        Word currentWord = getItem(position);
        if(currentWord != null){
            TextView textEnglish = (TextView) v.findViewById(R.id.english_meaning);
            TextView textMiwok = (TextView) v.findViewById(R.id.miwok_meaning);
            textEnglish.setText(currentWord.getDefaultTranslation());
            textMiwok.setText(currentWord.getMiwokTranslation());
        }
        return v;
    }
}