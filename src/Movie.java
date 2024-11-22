public class Movie {
    String title;
    int year;
    String director;
    boolean includedInPlan;
    double sumRate;
    int totalRate;
    int durationInMinutes;

    void showTechnicalSheet() {
        System.out.println("Titulo: " + this.title);
        System.out.println("Ano de lançamento: " + this.year);
        System.out.println("Diretor: " + this.director);
        System.out.println("Tempo de duração: " + this.durationInMinutes + " min");
        System.out.println("Incluido no plano: " + this.includedInPlan);
    }

    void rate(double rating) {
        this.sumRate += rating;
        this.totalRate++;
    }

    double averageRating() {
        return this.sumRate / this.totalRate;
    }
}
