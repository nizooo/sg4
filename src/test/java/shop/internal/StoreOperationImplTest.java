package shop.internal;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StoreOperationImplTest {
	
	/**
	 * The object beign tested.
	 */
	
	private StoreOperation storeOpeation;
	
	
	@Before
	public  void setUp(){
		
		CustomerRepository customerRepo = new StubCustomerRepository();
		storeOpeation = new StoreOperationImpl(customerRepo);
		
	}
	
	@Test
	public void testPrepareOrder(){
		
	 Order order = 	storeOpeation.prepareOrder(null);
		
		assertEquals(5, order.getQty());
		
	}

}
