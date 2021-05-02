
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer = new Customer(1,"Yunus Emre","Duymaz",new Date(1990,8,13),"123123");
		customerManager.save(customer);
	

	}

}
