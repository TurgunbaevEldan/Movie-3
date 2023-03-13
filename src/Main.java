import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        private String name;
//        private int year;
//        private String description;
//        private Director director;
//        private List<Cast> cast;
//        Cast:
//        private String actorFullName;
//        private String role;
//        Director:
//        private String name;
//        private String lastName;
//        Findable:
//        List<Movie>getAllMovies(List<Movie>movies);
//        void findMovieByName(List<Movie>movies);
//        void findMovieByActorName(List<Movie>movies);
//        void findMovieByYear(List<Movie>movies);
//        void findMovieByDirector(List<Movie>movies);
//        void findMovieByDescription(List<Movie>movies);
//        void findMovieByRole(List<Movie>movies);
//        Sortable:
//        void sortByMovieName(List<Movie>movies);
//        -from A to Z
//        -from Z to A
//        void sortByYear(List<Movie>movies);
//        -Ascending
//        -Descending
//        void sortByDirector(List<Movie>movies);
//        Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
//                Бардык маалыматтар туура жана так болуп консольго чыксын.
        Director director1 = new Director("Гальдер","Гастелу-Уррутия");
        Director director2 = new Director("Данияр","Болотбеков");

        List<Cast>casts1 = new LinkedList<>();
        List<Cast>casts2 = new LinkedList<>();
        Cast cast1 = new Cast("Иван Массаге",",Герой");
        Cast cast2 = new Cast("Зоррион Экуелеор","больной");

        casts1.add(cast1);
        casts2.add(cast2);

        List<Movie>movies = new LinkedList<>();
        Movie movie1 = new Movie("Платформа",2019,"Научно-фантастический фильм",director1, casts1);
        Movie movie2 = new Movie("Зомбеты",2021,"фильм ужасов",director2,casts2 );

        movies.add(movie1);
        movies.add(movie2);

        int search =new Scanner(System.in).nextInt();
        Movies movies1 = new Movies();
        Sorts sorts = new Sorts();

        switch (search){
            case 1 -> movies1.getAllMovies(movies);
            case 2 -> movies1.findMovieByName(movies);
            case 3 -> movies1.findMovieByActorName(movies);
            case 4 -> movies1.findMovieByYear(movies);
            case 5 -> movies1.findMovieByDirector(movies);
            case 6 -> movies1.findMovieByDescription(movies);
            case 7 -> movies1.findMovieByRole(movies);
            case 8 -> sorts.sortByMovieName(movies);
            case 9 -> sorts.sortByYear(movies);
            case 10 ->sorts.sortByDirector(movies);
        }
    }
}