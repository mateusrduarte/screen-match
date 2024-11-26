package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Movie movie1 = new Movie(
                "The Matrix",
                1999,
                135,
                "Lana Wachowski, Lilly Wachowski"
        );
        movie1.rate(8.8);

        Movie movie2 = new Movie(
                "John Wick",
                2014,
                101,
                "Chad Stahelski"
        );
        movie2.rate(9.2);

        Serie serie1 = new Serie(
                "La Casa de Papel",
                2017,
                5,
                10,
                45
        );

        ArrayList<Title> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(serie1);

        for (Title title : movieList) {
            System.out.println(title);
            if (title instanceof Movie movie) {
                System.out.println("Classificação: " + movie.getClassification());
            }
        }

        System.out.println(movieList);
        Collections.sort(movieList);
        System.out.println("Lista ordenada: " + movieList);
    }
}
