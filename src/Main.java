import br.com.alura.screenmatch.calculus.RecommendationFilter;
import br.com.alura.screenmatch.calculus.TimeCalculator;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.setTitle("The Matrix");
        movie1.setYear(1999);
        movie1.setDurationInMinutes(135);
        movie1.setIncludedInPlan(true);

        Movie movie2 = new Movie();
        movie2.setTitle("John Wick");
        movie2.setYear(2014);
        movie2.setDurationInMinutes(101);
        movie2.setIncludedInPlan(true);

        Serie serie1 = new Serie();
        serie1.setTitle("La Casa de Papel");
        serie1.setYear(2017);
        serie1.setIncludedInPlan(true);
        serie1.setActive(true);
        serie1.setSeasons(5);
        serie1.setEpisodesBySeason(10);
        serie1.setMinutesByEpisode(45);

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