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
        Concrete Concrete = new Concrete(context);
        dispatcher.attach(Concrete);

        
       
        assertEquals("Titanic",  context.getMovieName());
    }
}

