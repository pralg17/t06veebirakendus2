package henry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Rakendus {

	
	@RequestMapping("/tervita")
	String tervitusfunktsioon1(String eesnimi){
		return "Tere, "+eesnimi;
	}
	
	@RequestMapping("/peeter")
	String tervitusfunktsioon2(String eesnimi) {
		if (eesnimi.equals("peeter")) {
			return "Peeter sina ei või seda lehte külastada!";
		} else {
			return "Tere tulemast " + eesnimi;
		}
	}

	@RequestMapping("/you")
	String tervitusfunktsioon3(String eesnimi, String perekonnanimi) {
		if (eesnimi == null || perekonnanimi == null || eesnimi == "" || perekonnanimi == "") {
			return "Youyou mees, lükka nimi sisse vennas!";
		} else {
			return "You " + eesnimi + " " + perekonnanimi +" ,kuidas käpp käib?";
		}
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
    }
}
