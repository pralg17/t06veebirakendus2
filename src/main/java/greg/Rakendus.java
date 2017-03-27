package greg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	String eesnimi;
	
	@RequestMapping("/")
    String tervitusfunktsioon() {
        return "Pealeht, vt. /loo?eesnimi=minginimi";
    }
	
	@RequestMapping("/loo")
	String looUusInimene(String eesnimi){
		this.eesnimi = eesnimi;	
		return "Loodi uus inimene " + this.eesnimi + ".\n vt. /tervitus";
	}
	
	@RequestMapping("/tervitus")
	String tervitus(){
		if(this.eesnimi == null){
			return "Pole keda tervitada! vt. /uus?eesnimi=minginimi";
		} else {
			return "Tere " + this.eesnimi + "!";
		}
	}
	
    public static void main(String[] args) {
		//Rakendus uusRakendus = new Rakendus();
		System.getProperties().put("server.port", 4211);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
