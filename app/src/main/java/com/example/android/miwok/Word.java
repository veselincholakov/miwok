package com.example.android.miwok;

/**
 * Created by Veselin.Cholakov on 13.2.2017 г..
 */

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;

    public Word(String englishTranslation, String miwokTranslation){
        this.mEnglishTranslation = englishTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mEnglishTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
