import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1,"Burak","Boduroðlu", LocalDate.of(2001,1,13),"Kimlik-No"));
		
	}

}
