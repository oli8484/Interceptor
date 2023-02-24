import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
public class TestCase1 {
    





    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {
       
       //Testing Context 
        Movie movie = new Movie("Titanic", 0);
      
        
        Context context = new Context(movie);
        Dispatcher dispatcher = new Dispatcher();
        Logger logger = new Logger(context);
        dispatcher.attach(logger);

        
       
        assertEquals("Titanic",  context.getMovieName());
    }
}

