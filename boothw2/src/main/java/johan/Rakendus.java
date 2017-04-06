package johan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication
public class Rakendus{
	
	@RequestMapping("/n2itlejainf")
	public String n2itleja(String eesnimi, String perekonnanimi, String IMDBkood){
		return "Näitleja "+eesnimi+" "+perekonnanimi+" IMDB kood on: "+IMDBkood;
	}
	
	@RequestMapping("/IMDBkood")
	public String kood(String IMDBkood){
		if (IMDBkood.length()==9){
			return IMDBkood;
		} else {
			return "Sisestatud kood:" +IMDBkood+ " ei kuulu ühelegi näitlejale";
		}
	}
	
	public static void main(String[] args){
		System.getProperties().put("server.port", 4430);
		SpringApplication.run(Rakendus.class, args);
	}
	
	
}
//scl enable rh-maven33 bash
//mvn package
//java -jar target/boothw2-1.jar

