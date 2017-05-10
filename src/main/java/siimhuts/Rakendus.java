package siimhuts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/isikuleht")
	public String isik(String eesnimi, String perekonnanimi, String telnr){
		   return "Tere, "+eesnimi+ " " + perekonnanimi + ", Teie telefoninumber on " + telnr;
	}

	@RequestMapping("/telnr")
	public String kood(String telnr){
		if (telnr.length()>=5 || telnr.length()<=10){
			return telnr;
		} else {
			return "Halb";
		}
	}
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4029);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
