import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private List<Concrete> interceptors;

    public Dispatcher() {
        this.interceptors = new ArrayList<Concrete>();
    }

    public void attach(Concrete l) {
        if (!interceptors.contains(l))
            interceptors.add(l);
    }

    public void detach(Concrete l) {
        interceptors.remove(l);
    }

    public List<Concrete> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(List<Concrete> interceptors) {
        this.interceptors = interceptors;
    }

    public void interceptMovieTitle(Context m) {
        for (Concrete l : interceptors) {
            l.interceptMovieTitle(m);
        }
    }

    public void interceptGetPriceCode(Context m) {
        for (Concrete l : interceptors) {
            l.interceptGetPriceCode(m);
            ;
        }
    }
}
