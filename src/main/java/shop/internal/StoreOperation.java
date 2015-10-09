package shop.internal;

public interface StoreOperation {
	
	/**
	 * Prepare an order
	 * @param order
	 * @return order object 
	 */
	public Order prepareOrder(Order order);

}
