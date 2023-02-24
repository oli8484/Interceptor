
import java.util.Objects;

public class Context {
    private Movie movie;

    public Context(Movie movie) {
        this.movie = Objects.requireNonNull(movie, "Movie cannot be null.");
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getMovieName() {

        return movie.getTitle();

    }

}
