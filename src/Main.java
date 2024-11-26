import br.com.alura.screenmatch.calculus.RecommendationFilter;
import br.com.alura.screenmatch.calculus.TimeCalculator;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie(
                "The Matrix",
                1999,
                135,
                "Lana Wachowski, Lilly Wachowski"
        );

        Movie movie2 = new Movie(
                "John Wick",
                2014,
                101,
                "Chad Stahelski"
        );

        Serie serie1 = new Serie(
                "La Casa de Papel",
                2017,
                5,
                10,
                45
        );

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includeTime(movie1);
        timeCalculator.includeTime(movie2);
        timeCalculator.includeTime(serie1);

        System.out.println("Tempo total: " + timeCalculator.getTimeTotal());

        Episode episode1 = new Episode();
        episode1.setEpisodeNumber(1);
        episode1.setSerie(serie1);
        episode1.setTotalViews(300);

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(movie1);
        filter.filter(movie2);
        filter.filter(episode1);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);

        System.out.println("Tamanho da lista de filmes: " + movieList.size());
        System.out.println("Primeiro filme: " + movieList.get(0));
        System.out.println(movieList);
    }
}