package com.example.animelist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animallist.R;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {

    private final ArrayList<Anime> values;
    private final LayoutInflater inflater;

    public AnimeAdapter(Context context, ArrayList<Anime> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Anime anime = values.get(position);
        holder.txtTitle.setText(anime.title);
        holder.txtGenre.setText(anime.genre);
        holder.txtStudio.setText(anime.studio);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailAnimeActivity.class);
//                Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
                intent.putExtra("title", anime.title);
                intent.putExtra("genre", anime.genre);
                intent.putExtra("studio", anime.studio);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtGenre, txtStudio;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtGenre = itemView.findViewById(R.id.txt_genre);
            txtStudio = itemView.findViewById(R.id.text_studio);
        }
    }
}
