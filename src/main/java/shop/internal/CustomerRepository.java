package shop.internal;

public interface CustomerRepository {
	
	/**
	 * Load a customer by its credit card.
	 * @param creditCardNumber
	 * @return the customer objects
	 */
	public Customer findByCreditCard(String creditCardNumber);
	
	/**
	 * 
	 */
	public void updateAccount();
	

}
