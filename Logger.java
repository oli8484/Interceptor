
public class Logger implements Interceptor {

    private Context context;

    public Logger(Context m) {
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
        System.out.println("LOG: Movie Name: " + title);

    }

    @Override
    public void interceptGetPriceCode(Context m) {
        int priceCode = m.GetPriceCode();
        System.out.println("LOG: Movie Price Code: " + priceCode);

    }
}
