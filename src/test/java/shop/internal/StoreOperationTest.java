package shop.internal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreOperationTest  {

	private ApplicationContext context;
	private StoreOperation storeOperation;
	
	@Before
	public void setUp(){
		
		context = new ClassPathXmlApplicationContext("store/internal/test-infrastructure.xml");
		storeOperation = context.getBean("storeOperation", StoreOperation.class);
		
		
	}
	
	
	//public void 

}
