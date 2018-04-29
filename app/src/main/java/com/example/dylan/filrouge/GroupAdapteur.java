package com.example.dylan.filrouge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.security.acl.Group;
import java.util.List;

public class GroupAdapteur extends ArrayAdapter<Groupe> {


    public GroupAdapteur(@NonNull Context context, List<Groupe> groupe) {
        super(context, 0,groupe);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_tweetgroup, parent, false);
        }

        GroupAdapteur.TweetViewHolder viewHolder = (GroupAdapteur.TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new GroupAdapteur.TweetViewHolder();
            viewHolder.nom = convertView.findViewById(R.id.nomGroup);
            convertView.setTag(viewHolder);
        }
        Groupe groupe = getItem(position);
        viewHolder.nom.setText(groupe.getNom_group());

        return convertView;
    }

    private class TweetViewHolder{
        public TextView nom;
    }
}
