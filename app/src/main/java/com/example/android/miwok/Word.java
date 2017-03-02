package com.example.android.miwok;

/**
 * Created by Veselin.Cholakov on 13.2.2017 г..
 */

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId = 0;
    private int mPrononunciationId = 0;

    public Word(String englishTranslation, String miwokTranslation, int prononciationId){
        this.mEnglishTranslation = englishTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mPrononunciationId = prononciationId;
    }

    public Word(String mMiwokTranslation , String mEnglishTranslation, int mImageResourceId, int prononciationId) {
        this.mImageResourceId = mImageResourceId;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mPrononunciationId = prononciationId;
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

    public int getPrononunciationId() {
        return mPrononunciationId;
    }
}
