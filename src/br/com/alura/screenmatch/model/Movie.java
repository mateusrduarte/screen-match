package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculus.Classifiable;

public class Movie extends Title implements Classifiable {

    //  ATTRIBUTES

    private String director;

//    CONSTRUCTORS

    public Movie(String title, int year, int duration, String director) {
        super(title, year);
        setDurationInMinutes(duration);
        setDirector(director);
        setIncludedInPlan(true);
    }

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
