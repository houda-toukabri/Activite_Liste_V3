package com.iset.activite_liste_v3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

class UsersAdapter extends ArrayAdapter<User> {


    public UsersAdapter(@NonNull Context context, @NonNull ArrayList<User> objects) {
        super(context, 0, objects);
    }
        public View getView ( int position, View convertView, ViewGroup parent){
            // Get the data item for this position
            User user = getItem(position);
            // Check if an existing view is being reused, inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.item_user, parent, false);
            }
            // Lookup view for data population
            TextView tvName = convertView.findViewById(R.id.tvName);
            TextView tvHome = convertView.findViewById(R.id.tvHome);
            // Populate the data into the template view using the data object
            tvName.setText(user.name);
            tvHome.setText(user.hometown);
            // Return the completed view to render on screen
            return convertView;
        }
    }


