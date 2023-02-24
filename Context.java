
import java.util.Objects;

public class Context {
    private Customer customer;
    public Context(Customer customer) {
        this.customer = Objects.requireNonNull(customer, "Customer cannot be null.");
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
   
    
}
