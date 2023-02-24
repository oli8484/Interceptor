import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private List<Logger> interceptors;

    public Dispatcher() {
        this.interceptors = new ArrayList<Logger>();
    }

    public void attach(Logger l) {
        if (! interceptors.contains(l)) interceptors.add(l);
    }

    public void detach(Logger l){
        interceptors.remove(l);
    }

    public List<Logger> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(List<Logger> interceptors) {
        this.interceptors = interceptors;
    }

    public void interceptFrequentRenterPoints(Context m){
        for (Logger l: interceptors){
            l.interceptMovieTitle(m);
        }
    }
    public void interceptGetCharge(Context m){
        for(Logger l: interceptors){
            l.interceptGetPriceCode(m);;
        }
    }
}
