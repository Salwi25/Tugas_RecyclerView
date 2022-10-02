package com.example.animelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.animallist.R;

public class DetailAnimeActivity extends AppCompatActivity {
    TextView txtTitle, txtGenre, txtStudio;
    String title, genre, studio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);
        txtTitle = findViewById(R.id.txt_title);
        txtGenre = findViewById(R.id.txt_genre);
        txtStudio = findViewById(R.id.text_studio);

        Intent intent = getIntent();

        title = intent.getStringExtra("title");
        genre = intent.getStringExtra("genre");
        studio = intent.getStringExtra("studio");

        txtTitle.setText(title);
        txtGenre.setText(genre);
        txtStudio.setText(studio);

    }
}