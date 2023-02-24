
import java.util.Objects;

public class Context {
    private Movie movie;
    public Context(Movie movie) {
        this.movie = Objects.requireNonNull(movie, "Movie cannot be null.");
    }
    
    public Movie getCustomer() {
        return movie;
    }

    public void setCustomer(Movie movie) {
        this.movie = movie;
    }
   
    
}
