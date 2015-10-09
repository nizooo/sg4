package shop.internal;

public class StoreOperationImpl implements StoreOperation {
	
	private CustomerRepository customerRepository;
	
	
	
	/**
	 * Creates a new Store operation.
	 * @param customerRepository
	 */
	
	public StoreOperationImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}





	public Order prepareOrder(Order order) {
		
		Order order1 = new Order();
		order1.setQty(5);
		order1.setId(66);
		return order1;
	}

}
