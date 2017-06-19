package georg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.text.DecimalFormat;

@RestController
@SpringBootApplication

public class Rakendus {
	
	@RequestMapping("/volad")
	String volad(String nimi, String volg, String makse) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		if(nimi == null || volg == null || makse == null) {
			return "Andmeid ei ole sisestatud";
		}
		
		if(nimi.equals("") || volg.equals("") || makse.equals("")) {
			return "Andmed on tyhjad";
		}
		
		if(Double.parseDouble(makse) < 0 ) {
			return "Makse ei saa olla negatiivne";
		}
		
		double change = Double.parseDouble(volg) - Double.parseDouble(makse);
		
		return "Inimesele " + nimi + " oli volg: " + volg + " EUR, maksti: " + makse + " EUR, pysiv volg: " + format.format(change) + " EUR";
		
	}
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 5454);
		SpringApplication.run(Rakendus.class, args);
	}
	
}