package shop.internal;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {
	
	@Bean
	public Product product(){
		
		return new Product("laptop","hp pro book", BigDecimal.valueOf(900));
	}

}
