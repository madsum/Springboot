package fi.ma.vegshopping.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("fi.ma.vegshopping.impl")
@EnableJpaRepositories("fi.ma.vegshopping.impl")
@EntityScan(basePackages = "fi.ma.vegshopping.impl")
public class VegShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VegShoppingApplication.class, args);
	}
}
