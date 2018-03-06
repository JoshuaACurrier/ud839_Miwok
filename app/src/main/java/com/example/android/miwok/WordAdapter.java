package com.example.android.miwok;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Josh Currier on 3/5/2018.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity context,ArrayList<Word> listOfWords)
    {
        super(context,0,listOfWords);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        TextView englishText = (TextView) listItemView.findViewById(R.id.englishWord);

        assert word != null;
        englishText.setText(word.getmDefaultTranslation());

        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwokWord);

        miwokText.setText(word.getmMiwokTranslation());

        return listItemView;




    }
}