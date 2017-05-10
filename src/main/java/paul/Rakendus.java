package paul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Rakendus {

	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	@RequestMapping("/tervita")
	String tervitusfunktsioon2(String eesnimi){
		return "Tere, "+eesnimi;
	}
	
	@RequestMapping("/sobratervitus")
	String tervitusfunktsioon3(String eesnimi, String perekonnanimi) {
		if (eesnimi == null || perekonnanimi == null) {
			return "Sisesta oma ees- ja perekonnanimi ka!";		
		} else {
			return "Tere sõber" + eesnimi + " " + perekonnanimi.substring(0, 1);
		}
	}


    public static void main(String[] args) {
		System.getProperties().put("server.port", 4227);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar