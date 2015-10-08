package shop.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfApp {
	
	@Bean
	public Product product(){
		
		return new Product("laptop","hp pro book", 900);
	}

}
