package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculus.Classifiable;

public class Episode implements Classifiable {

//    ATTRIBUTES

    private String name;
    private int episodeNumber;
    private Serie serie;
    private int totalViews;

//    GETTERS

    public String getName() {
        return name;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

//    SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

//    METHODS

    @Override
    public double getClassification() {
        if (totalViews > 100) {
            return 4.0;
        } else {
            return 2.0;
        }
    }
}
