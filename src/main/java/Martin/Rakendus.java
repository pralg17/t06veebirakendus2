package Martin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	String linn;
	//Algus
	@RequestMapping("/")
    String tervitusfunktsioon() {
        return "Algus, /loo?linn=mingilinn";
    }
	//linna loomine
	@RequestMapping("/loo")
	String looUusLinn(String linn){
		this.linn = linn;	
		return "Uus linn loodud " + this.linn + " /n2gemine";
	}
	//linna n2gemine
	@RequestMapping("/n2gemine")
	String n2gemine(){
		if(this.linn == null){
			return "Linn puudub,  lisamiseks /uus?linn=mingilinn";
		} else {
			return "Linn on  " + this.linn + "!";
		}
	}
	//port
    public static void main(String[] args) {
		//Rakendus uusRakendus = new Rakendus();
		System.getProperties().put("server.port", 2459);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/testimine-1.jar
