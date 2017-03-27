package thetloffline;

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
	String tervitusfunktsioon3(String eesnimi){
		return "Tere, "+eesnimi;
	}
	
	@RequestMapping("/viisakastervitus")
	String tervitusfunktsioon4(String eesnimi, String perenimi) {
		if (eesnimi == null || perenimi == null) {
			return "Nimi puudub!";		
		} else {
			return "Tere, kodanik " + eesnimi + " " + perenimi.substring(0, 1);
		}
	}

	@RequestMapping("/johhaidii")
	String ebaviisakasTervitus(String eesnimi, String perenimi) {
		if (eesnimi == null || perenimi == null || eesnimi == "" || perenimi == "") {
			return "Johhaidii! Nimi puudub!";
		} else {
			return "Johhaidii! Tere, " + eesnimi + " " + perenimi;
		}
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar