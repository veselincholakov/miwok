package com.example.android.miwok;

/**
 * Created by Veselin.Cholakov on 13.2.2017 г..
 */

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId = 0;

    public Word(String englishTranslation, String miwokTranslation){
        this.mEnglishTranslation = englishTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public Word(String mMiwokTranslation , String mEnglishTranslation, int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDefaultTranslation(){
        return mEnglishTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
