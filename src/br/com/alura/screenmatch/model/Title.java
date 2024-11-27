package br.com.alura.screenmatch.model;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

    //  ATTRIBUTES

    @SerializedName("Title")
    private String title;
    @SerializedName("Year")
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

    public Title(TituloOmdb tituloOmdb) {
        this.title = tituloOmdb.title();
        this.year = Integer.parseInt(tituloOmdb.year());
        this.includedInPlan = true;
        this.durationInMinutes = Integer.parseInt(
                tituloOmdb.runtime()
                        .substring(0, tituloOmdb.runtime().indexOf(" min"))
        );
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
        return "Titulo" + title
                + ", Ano" + year
                + ", Duração: " + durationInMinutes
                + " min";
    }

    @Override
    public int compareTo(Title o) {
        return this.title.compareTo(o.getTitle());
    }
}
