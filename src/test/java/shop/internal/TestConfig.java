package shop.internal;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	
	
	@Bean
	public Product product(){
		
		return new Product("laptopTest","hp pro book", BigDecimal.valueOf(900));
	}

}
