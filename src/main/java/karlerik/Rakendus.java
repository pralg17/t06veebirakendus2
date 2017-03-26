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
		
		if(item == null || itemPrice == null || wallet == null) {
			return "Andmeid ei ole sisestatud";
		}
		
		if(item.equals("") || itemPrice.equals("") || wallet.equals("")) {
			return "Andmed on tyhjad";
		}
		
		if(Double.parseDouble(wallet) < Double.parseDouble(itemPrice)) {
			return "Ostu jaoks ei ole piisavalt raha";
		}
		
		double change = Double.parseDouble(wallet) - Double.parseDouble(itemPrice);
		
		return "Toode " + item + ", hind: " + itemPrice + " EUR, makstud: " + wallet + " EUR, tagasi: " + format.format(change) + " EUR";
		
	}
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4335);
		SpringApplication.run(Rakendus.class, args);
	}
	
}