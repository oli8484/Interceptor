
public class Main {
  
        
            public static void main(String[] args) {
                // create a movie object
                Movie movie = new Movie("The Matrix", Movie.NEW_RELEASE);
        
                // create a context object
                Context context = new Context(movie);
        
                // create a dispatcher object
                Dispatcher dispatcher = new Dispatcher();
        
                // create a concrete interceptor object and attach it to the dispatcher
                Concrete interceptor = new Concrete(context);
                dispatcher.attach(interceptor);
        
                // intercept the movie title and print the result
                dispatcher.interceptMovieTitle(context);
                // expected output: "Intercepted: The Matrix"
                System.out.println("Title: " + movie.getTitle());
        
                // intercept the price code and print the result
                dispatcher.interceptGetPriceCode(context);
                // expected output: "Price code: 0"
                System.out.println("Price code: " + movie.getPriceCode());
        
                // detach the interceptor
                dispatcher.detach(interceptor);
        
                // intercept the movie title again and print the result
                dispatcher.interceptMovieTitle(context);
                // expected output: "The Matrix"
                System.out.println("Title: " + movie.getTitle());
            }
        
        
      
       
    }

