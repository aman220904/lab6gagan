package com.example.lab6gagan;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);

        // Initialize the Toolbar
        Toolbar toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);  // Set the toolbar as the ActionBar

        // Optional: Set a title for the toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My Chat App");
        }
    }
}
