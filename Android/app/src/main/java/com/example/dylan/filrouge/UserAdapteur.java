package com.example.dylan.filrouge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapteur extends ArrayAdapter<User> {
    public UserAdapteur(@NonNull Context context, List<User> User) {
        super(context, 0,User);
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_tweetuser, parent, false);
        }

        UserAdapteur.TweetViewHolder viewHolder = (UserAdapteur.TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new UserAdapteur.TweetViewHolder();
            viewHolder.nomUser = convertView.findViewById(R.id.nomUser);
            convertView.setTag(viewHolder);
        }
        User user = getItem(position);
        viewHolder.nomUser.setText(user.toString());

        return convertView;
    }

    private class TweetViewHolder{
        public TextView nomUser;
    }
}
