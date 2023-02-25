
public class Concrete implements Interceptor {

    private Context context;

    public Concrete(Context m) {
        this.context = m;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context m) {
        this.context = m;
    }

    @Override
    public void interceptMovieTitle(Context m) {

        String title = m.getMovieName();

        // Example of modifying the movie title:
        if (title.startsWith("The ")) {
            String newTitle = title.replaceFirst("The ", "");
            m.setMovie(new Movie(newTitle, m.getMovie().getPriceCode()));
            System.out.println("Movie title intercepted and modified: " + newTitle);
        } else {
            System.out.println("Movie title intercepted but not modified: " + title);
        }

    }

    @Override
    public void interceptGetPriceCode(Context m) {

        int priceCode = m.GetPriceCode();

        // Example of modifying the price code:
        if (priceCode == Movie.REGULAR) {
            m.setMovie(new Movie(m.getMovie().getTitle(), Movie.NEW_RELEASE));
            System.out.println("Price code intercepted and modified: " + Movie.NEW_RELEASE);
        } else {
            System.out.println("Price code intercepted but not modified: " + priceCode);
        }

    }
}
