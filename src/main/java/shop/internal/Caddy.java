package shop.internal;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Caddy {
	
	private int id;
	private Customer customer;
	private BigDecimal total = BigDecimal.ZERO;
	
	@Autowired
	private Product product;
	
	private Map<Product, Integer> productsList = new HashMap<Product, Integer>();
	
	public void  addProduct(Product product, int qty){
		
		productsList.put(product, qty);
	}
	
	public Product getProduct(){
		
		return product;
	}
	
	public BigDecimal calculateCaddy(){
		
		Set<Product> products = productsList.keySet();
		Iterator it = products.iterator();
		
		while(it.hasNext()){
			
			Product pt = (Product) it.next();
			Integer qty = productsList.get(pt);
			
			total = total.add(pt.getPrice().multiply(BigDecimal.valueOf(qty)));
		}
		
		return total;
		
	
		
	}
	
	
}
