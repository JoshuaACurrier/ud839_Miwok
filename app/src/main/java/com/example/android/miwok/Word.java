package com.example.android.miwok;

/**
 * Created by Josh Currier on 2/28/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private int mAudioFileID;

    public Word(String toDefaultTranslation, String toMiwokTranslation, int toAudioFile){
        mDefaultTranslation = toDefaultTranslation;
        mMiwokTranslation = toMiwokTranslation;
        mImageResourceID = 0;
        mAudioFileID = toAudioFile;
    }

    public Word(String toDefaultTranslation, String toMiwokTranslation, int toImageFile, int toAudioFile)
    {
        mDefaultTranslation = toDefaultTranslation;
        mMiwokTranslation = toMiwokTranslation;
        mImageResourceID = toImageFile;
        mAudioFileID = toAudioFile;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceID(){
        return mImageResourceID;
    }

    public int getmAudioFileID() { return mAudioFileID;}


}
