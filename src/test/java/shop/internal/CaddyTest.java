package shop.internal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

import org.junit.Ignore;

@ContextConfiguration(classes={TestConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class CaddyTest {

	@Ignore
	public void testCalculateCaddy() throws Exception {
		Caddy caddy = new Caddy();
		caddy.calculateCaddy();
	}

	@Test
	public void testIO(){
		
		Caddy caddy = new Caddy();
		Product product = caddy.getProduct();
		assertNotNull(product);
		assertEquals("laptopTest", product.getName());
		
	}
}
