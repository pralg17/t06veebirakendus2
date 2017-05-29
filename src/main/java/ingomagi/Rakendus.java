package ingomagi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {

	@RequestMapping("/ruut")
	String ruut(String ruut){
        try{
            double Arv = Double.parseDouble(ruut);
           return String.valueOf(Math.pow(Arv, 2));
       } catch (Exception e){
            return "Viga: "+e.getMessage();
        }
   }
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 5501);
        SpringApplication.run(Rakendus.class, args);
    }
}	

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar


//Results :

//Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
