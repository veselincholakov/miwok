package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Word> words = new ArrayList<Word>(Arrays.asList(new Word("red","weṭeṭṭi",R.drawable.color_red, R.raw.color_red), new Word("green","chokokki",R.drawable.color_green, R.raw.color_green),
                new Word("brown","ṭakaakki",R.drawable.color_brown, R.raw.color_brown), new Word("gray","ṭopoppi",R.drawable.color_gray, R.raw.color_gray),
                new Word("black","kululli",R.drawable.color_black, R.raw.color_black), new Word("white","kelelli",R.drawable.color_white, R.raw.color_white),
                new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow), new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow)));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list) ;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mPlayer = MediaPlayer.create(ColorsActivity.this, word.getPrononunciationId());
                mPlayer.start();
            }
        });
    }
}
