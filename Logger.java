
public class Logger implements Interceptor {

    private Context context;

    public Logger(Context c) {
        this.context = c;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context c) {
        this.context = c;
    }

    @Override
    public void interceptMovieTitle(Context m) {

    }

    @Override
    public void interceptGetPriceCode(Context m) {

    }
}
