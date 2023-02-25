import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;


import java.util.List;

public class InterceptorTest {

    @Test
    public void testInterceptor() {
        // create a movie object
        Movie movie = new Movie("The Shawshank Redemption", Movie.REGULAR);

        // create a context object
        Context context = new Context(movie);

        // create a dispatcher object
        Dispatcher dispatcher = new Dispatcher();

        // create a concrete interceptor object and attach it to the dispatcher
        Concrete interceptor = new Concrete(context);
        dispatcher.attach(interceptor);

        // intercept the movie title and verify that it was modified by the interceptor
        dispatcher.interceptMovieTitle(context);
        assertEquals("The Shawshank Redemption", movie.getTitle());

        // intercept the price code and verify that it was modified by the interceptor
        dispatcher.interceptGetPriceCode(context);
        assertEquals(0, movie.getPriceCode());

        // detach the interceptor and verify that it is no longer called
        dispatcher.detach(interceptor);
        List<Concrete> interceptors = dispatcher.getInterceptors();
        assertTrue(interceptors.isEmpty());
    }
}
