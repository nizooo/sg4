package shop.internal;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
	
	private int id = 0;
	private int qty = 0;
	
	@Autowired
	private Product product;
	
	
	public Order createOrder(Product product, int qty){
		this.product = product;
		this.qty = qty;
		
		System.out.println("order id = "+this.id);
		System.out.println("product name  = "+product.getName());
		System.out.println("product 's price  = "+product.getPrice());
		System.out.println("qty is "+ this.qty);
		
		this.id = 111;
		return null;
		
		
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
