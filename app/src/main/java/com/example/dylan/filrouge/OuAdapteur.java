package com.example.dylan.filrouge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class OuAdapteur extends ArrayAdapter<Ou> {

    public OuAdapteur(@NonNull Context context, List<Ou> Ou) {
        super(context, 0,Ou);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_tweetou, parent, false);
        }

        TweetViewHolder viewHolder = (TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new TweetViewHolder();
            viewHolder.nom = convertView.findViewById(R.id.nomOu);
            convertView.setTag(viewHolder);
        }
        Ou ou = getItem(position);
        viewHolder.nom.setText(ou.getNom_ou());

        return convertView;
    }

    private class TweetViewHolder{
        public TextView nom;
    }
}
