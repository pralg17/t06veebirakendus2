package elle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/isikuleht")
 	public String isik(String eesnimi, String perekonnanimi, String kassakood){
 		   return "Tere, "+eesnimi+ " " + perekonnanimi + ". Teie kassakood on " + kassakood;
 	}

 	@RequestMapping("/kassakood")
 	public String kood(String kassakood){
 		if (kassakood.length()==4){
 			return kassakood;
 		} else {
 			return "Ei sobi";
 		}
 	}
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4022);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/app-1.jar
