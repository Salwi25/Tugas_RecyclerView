package com.example.animelist;

public class Anime {
    String title;
    String genre;
    String studio;

    public Anime(String title, String genre, String studio) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
    }

    public String getTitle() {

        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getEpisodes() {
        return studio;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public void setGenre(String color) {

        this.genre = genre;
    }

    public void setStudio(String desc) {

        this.studio = studio;
    }
}
