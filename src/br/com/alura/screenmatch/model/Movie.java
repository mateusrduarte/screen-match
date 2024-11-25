package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculus.Classifiable;

public class Movie extends Title implements Classifiable {

    //  ATTRIBUTES

    private String director;

    //  GETTERS

    public String getDirector() {
        return director;
    }

    //  SETTERS

    public void setDirector(String director) {
        this.director = director;
    }

//    METHODS

    @Override
    public double getClassification() {
        return (averageRating() / 2);
    }
}
