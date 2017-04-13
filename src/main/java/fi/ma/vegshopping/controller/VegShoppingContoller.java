package fi.ma.vegshopping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegShoppingContoller {

	@RequestMapping("/hi") 
	String sayHi(){
		System.out.println("test");
		return "Hi";
	}

}
