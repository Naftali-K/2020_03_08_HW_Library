package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add new book
        Button btnAdd = findViewById(R.id.add_book);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add new Book", Toast.LENGTH_LONG).show();

                EditText titleEt = findViewById(R.id.title_book);
                    String title = titleEt.getText().toString();
                EditText authorEt = findViewById(R.id.author_book);
                    String author = authorEt.getText().toString();
                EditText dateEt = findViewById(R.id.date_book);
                    String date = dateEt.getText().toString();
            }
        });

        //Show all books
        Button showList = findViewById(R.id.show_all_book);
        showList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Move to list of books", Toast.LENGTH_LONG).show();

            }
        });
    }
}
