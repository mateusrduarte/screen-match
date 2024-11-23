package br.com.alura.screenmatch.model;

public class Movie {

//  ATTRIBUTES
    private String title;
    private int year;
    private String director;
    private boolean includedInPlan;
    private double sumRate;
    private int totalRate;
    private int durationInMinutes;

//  GETTERS
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getTotalRate() {
        return totalRate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

//  SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

//  METHODS
    public void showTechnicalSheet() {
        System.out.println("Titulo: " + this.title);
        System.out.println("Ano de lançamento: " + this.year);
        System.out.println("Diretor: " + this.director);
        System.out.println("Tempo de duração: " + this.durationInMinutes + " min");
        System.out.println("Incluido no plano: " + this.includedInPlan);
    }

    public void rate(double rating) {
        this.sumRate += rating;
        this.totalRate++;
    }

    public double averageRating() {
        return this.sumRate / this.totalRate;
    }
}
