import java.util.List;
import java.util.Scanner;

public class Movies implements Findable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie a : movies) {
            System.out.println(a.toString());
        }
        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        String v = new Scanner(System.in).nextLine();
        for (Movie b : movies) {
            if (b.getName().toUpperCase().equals(v)) {
                System.out.println(b.toString());
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        String n = new Scanner(System.in).nextLine();
        for (Movie k : movies) {
            for (Cast cast1 : k.getCast()) {
                if (cast1.getActorFullName().toUpperCase().equals(n)) {
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        int u = new Scanner(System.in).nextInt();
        for (Movie t:movies) {
            if(t.getYear()==u){
                System.out.println(t.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        String o = new Scanner(System.in).nextLine();
        for (Movie i:movies) {
            if (i.getDirector().getName().toUpperCase().equals(o)){
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        String p = new Scanner(System.in).nextLine();
        for (Movie w:movies) {
            if(w.getDescription().toUpperCase().equals(p)){
                System.out.println(w.toString());
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        String y = new Scanner(System.in).nextLine();
        for (Movie e:movies) {
            for (Cast cast: e.getCast()) {
                if (cast.getRole().toUpperCase().equals(y)){
                    System.out.println(cast.toString());
                }
            }
        }
    }

}