public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.title = "The Lord of the Rings";
        movie.year = 2001;
        movie.director = "Peter Jackson";
        movie.durationInMinutes = 178;

        movie.showTechnicalSheet();
        movie.rate(8);
        movie.rate(5);
        movie.rate(10);

        System.out.println(movie.averageRating());
    }
}