
public class Main {
    public static void main(String[] args) {
        
       Movie movie = new Movie("Titanic", 0);
      
        
        Context context = new Context(movie);
        Dispatcher dispatcher = new Dispatcher();
        Concrete Concrete = new Concrete(context);
        dispatcher.attach(Concrete);

      
       
    }
}
