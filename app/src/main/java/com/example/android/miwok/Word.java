package com.example.android.miwok;

/**
 * Created by Josh Currier on 2/28/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;

    public Word(String toDefaultTranslation, String toMiwokTranslation){
        mDefaultTranslation = toDefaultTranslation;
        mMiwokTranslation = toMiwokTranslation;
        mImageResourceID = 0;
    }

    public Word(String toDefaultTranslation, String toMiwokTranslation, int toImageFile)
    {
        mDefaultTranslation = toDefaultTranslation;
        mMiwokTranslation = toMiwokTranslation;
        mImageResourceID = toImageFile;
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


}
