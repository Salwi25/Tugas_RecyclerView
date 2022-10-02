package com.example.animelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animallist.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Anime> anime = new ArrayList<>();
    private AnimeAdapter animeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();


        animeAdapter =new AnimeAdapter(this, anime);
        recyclerView = findViewById(R.id.rv_anime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animeAdapter);
    }

    private void addData() {
        anime.add(new Anime("One Piece", "Action", "Toei Animation"));
        anime.add(new Anime("Spy x Family", "Action", "WIT Studio & Clover Studio"));
        anime.add(new Anime("Boruto: Naruto Next Generation", "Adventure", "Studio Pirrot"));
        anime.add(new Anime("Naruto Shippuden", "Comedy", "Studio Pirrot"));
        anime.add(new Anime("Hunter x Hunter", "Fantasy", "Studio Pirrot"));
        anime.add(new Anime("Shikimori's Not Just A Cutie", "Romance", "Doga Kobo"));
        anime.add(new Anime("Jujutsu Kaisen", "Fantasy", "MAPPA"));
    }
}