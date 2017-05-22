package Stivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus{
	@RequestMapping("/hinnaKalk")
	String hk(String arv1, String kaart){
		if(arv1 == null){
			return "Andmed puuduvad";
		}
		int kogus = Integer.parseInt(arv1);
		int kaartOlemas = Integer.parseInt(kaart);
		int hind;
		double kokku;
		if(kaartOlemas == 0){
			return "Kaarti pole";
		}
		if(kaartOlemas == 1){
			return "Kaart on";
		}
		if(kogus>5){
			hind = 2;
			kokku = kogus*hind;
		} else{
			hind = 3;
			kokku = kogus*hind;
		}
		if(kaartOlemas == 1){
			kokku = kokku*0.8;
		}
		return "Kliendi kaart: "+ kaartOlemas +"\nKogus on: "+ arv1 +"\nKokku on hind: "+ kokku;
	}
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4444);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar