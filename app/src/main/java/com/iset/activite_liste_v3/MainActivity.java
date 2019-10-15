package com.iset.activite_liste_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lvItems);
        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        arrayOfUsers.add(new User("Ali", "Tunis"));
        arrayOfUsers.add(new User("Ahmed","Nabeul"));
        arrayOfUsers.add(new User("Ilhem","Ariana"));

        // Create the adapter to convert the array to views
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUsers);
        listView.setAdapter(adapter);

    }
}
