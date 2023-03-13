import java.util.List;
public class Sorts implements
        Sortable{
    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(Movie.sortByMovieName);
        for (Movie o:movies) {
            System.out.println(o);
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(Movie.sortByMovieYear);
        for (Movie i:movies) {
            System.out.println(i);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(Movie.sortByMovieDirector);
        for (Movie p:movies) {
            System.out.println(p);
        }
    }
}
