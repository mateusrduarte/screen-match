package br.com.alura.screenmatch.calculus;

import br.com.alura.screenmatch.model.Title;

public class TimeCalculator {

    //    ATTRIBUTES
    private int timeTotal;

//    GETTERS
    public int getTimeTotal() {
        return timeTotal;
    }

//    METHODS
    public void includeTime(Title title) {
        this.timeTotal += title.getDurationInMinutes();
    }
}
