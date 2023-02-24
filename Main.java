
public class Main {
    public static void main(String[] args) {
        
       Movie movie = new Movie("Titanic", 121212);
      
        
        Context context = new Context(movie);
        Dispatcher dispatcher = new Dispatcher();
        Logger logger = new Logger(context);
        dispatcher.attach(logger);

      
       
    }
}
