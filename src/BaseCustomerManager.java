
public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to Database : "+customer.getFirstName());
		
	}

}
