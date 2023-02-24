
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
        System.out.println("Movie Name: " + title);

    }

    @Override
    public void interceptGetPriceCode(Context m) {
        int priceCode = m.GetPriceCode();
        System.out.println("Movie Price Code: " + priceCode);

    }
}
