package karlerik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.text.DecimalFormat;

@RestController
@SpringBootApplication

public class Rakendus {
	
	@RequestMapping("/shoppingcart")
	String shoppingCart(String item, String itemPrice, String wallet) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		double change = Double.parseDouble(wallet) - Double.parseDouble(itemPrice);
		
		return "Toode " + item + ", hind: " + itemPrice + " EUR, makstud: " + wallet + " EUR, tagasi: " + format.format(change) + " EUR";
		
	}
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4335);
		SpringApplication.run(Rakendus.class, args);
	}
	
}