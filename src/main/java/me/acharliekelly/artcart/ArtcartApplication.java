package me.acharliekelly.artcart;

import me.acharliekelly.artcart.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArtcartApplication {

	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.save(...);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ArtcartApplication.class, args);
	}

}
