package shop.internal;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;

public class StubCustomerRepository implements CustomerRepository {
	private Map<String, Customer> customerByCreditCard = new HashMap<String, Customer>();
	
	public StubCustomerRepository(){
		
		Customer customer = new Customer("toto","33", "avenu gambetta", "toto@gmail.com");
	}
	

	public Customer findByCreditCard(String creditCardNumber) {
		Customer customer = customerByCreditCard.get(creditCardNumber);
		if(customer == null){
			
			throw new EmptyResultDataAccessException(1);
		}
		
		
		return customer;
	}

	public void updateAccount() {
		// TODO Auto-generated method stub

	}

}
