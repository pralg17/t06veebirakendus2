package jsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class rakendus {

	@RequestMapping("/ruutjuur")
	String rj(double juur){
	  try{
		return String.valueOf(Math.sqrt(juur));
	  } catch(Exception e){
		 return "Viga: "+e.getMessage();
	  }
	}
	
	@RequestMapping("/geomeetriline_keskmine")
	String geomkesk(double arv1, double arv2){
	  try{
		return String.valueOf(Math.sqrt(arv1*arv2));
	  } catch(Exception e){
		 return "Viga: "+e.getMessage();
	  }
	}	
	
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4286);
        SpringApplication.run(rakendus.class, args);
    }
}


//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar


/*
http://localhost:4286/geomeetriline_keskmine?arv1=3&arv2=9
5.196152422706632

http://localhost:4286/ruutjuur?juur=9
3.0
*/