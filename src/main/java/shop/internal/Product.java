package shop.internal;

public class Product {
	
	private String name;
	private String description;
	private Number price;
	
	
	/**
	 * 
	 * @param name
	 * @param description
	 * @param price
	 */
	public Product(String name, String description, Number price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Number getPrice() {
		return price;
	}
	
	public void setPrice(Number price) {
		this.price = price;
	}
	
	
	

}
