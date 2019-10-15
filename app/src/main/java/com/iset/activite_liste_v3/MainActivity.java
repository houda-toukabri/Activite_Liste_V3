package com.iset.activite_liste_v3;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lvItems);

        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<>();

        // Create the adapter to convert the array to views
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUsers);
        listView.setAdapter(adapter);
        adapter.add(new User("User 1", "Hometown 1"));
        adapter.add(new User("User 2", "Hometown 2"));
        adapter.add(new User("User 3", "Hometown 3"));
    }
}
