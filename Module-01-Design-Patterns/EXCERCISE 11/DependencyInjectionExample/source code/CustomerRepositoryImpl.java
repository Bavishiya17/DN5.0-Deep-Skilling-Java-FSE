public class CustomerRepositoryImpl implements CustomerRepository {

    public String findCustomerById(int id) {
        if (id == 1) {
            return "Customer: John";
        } else if (id == 2) {
            return "Customer: David";
        } else {
            return "Customer not found";
        }
    }
}