package com.example.android.miwok;

/**
 * Created by Josh Currier on 2/28/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String toDefaultTranslation, String toMiwokTranslation)
    {
        mDefaultTranslation = toDefaultTranslation;
        mMiwokTranslation = toMiwokTranslation;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation()
    {
        return mMiwokTranslation;
    }


}
