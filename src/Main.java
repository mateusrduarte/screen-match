import br.com.alura.screenmatch.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("The Lord of the Rings");
        movie.setYear(2001);
        movie.setDirector("Peter Jackson");
        movie.setDurationInMinutes(178);

        movie.showTechnicalSheet();
        movie.rate(8);
        movie.rate(5);
        movie.rate(10);

        System.out.println(movie.averageRating());
    }
}