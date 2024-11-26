package br.com.alura.screenmatch.model;

public class Title implements Comparable<Title> {

    //  ATTRIBUTES

    private String title;
    private int year;
    private boolean includedInPlan;
    private double sumRate;
    private int totalRate;
    private int durationInMinutes;

//    CONSTRUCTORS

    public Title(String title, int year) {
        this.title = title;
        this.year = year;
    }


    //  GETTERS

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean getIncludedInPlan() {
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

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    //  METHODS

    public void showTechnicalSheet() {
        System.out.println("Titulo: " + this.title);
        System.out.println("Ano de lançamento: " + this.year);
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

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }

    @Override
    public int compareTo(Title o) {
        return this.title.compareTo(o.getTitle());
    }
}
