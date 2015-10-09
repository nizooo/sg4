package shop.internal;

public interface ProductRepository {
	
	
	/**
	 * Load a Product entity by its id.
	 * @param id
	 * @return the Product objects
	 */
	public Product findById(int id);
	
	

}
