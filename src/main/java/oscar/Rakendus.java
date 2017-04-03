package oscar;

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
	
	@RequestMapping("/tervitaterve")
	String tervitusfunktsioon4(String eesnimi, String perenimi){
		return "Tere, kodanik "+eesnimi+" "+perenimi;
	}
	
	@RequestMapping("/tervitusvanus")
	String tervitusfunktsioon5(String eesnimi, String perenimi, int vanus){
		return "Tere, kodanik "+eesnimi+" "+perenimi+" "+vanus;
	}
	
	@RequestMapping("/tehted")
	String arvutus(int arv1, int arv2){
		int jagamine = arv1/arv2;
		int korutamine = arv1*arv2;
		int liitmine = arv1+arv2;
		int lahutamine = arv1-arv2;
		return jagamine+","+korutamine+","+liitmine+","+lahutamine;
	}
	@RequestMapping("/pudrucal")
	String pudrucal(String banaan, String mesi, String helbed, String piim){
	  try{
		double a1=Double.parseDouble(banaan);
		double a2=Double.parseDouble(mesi);
		double a3=Double.parseDouble(helbed);
		double a4=Double.parseDouble(piim);
		double vastus = (a1*0.93)+(a2*3.3)+(a3*3.5)+(a4*0.52);
		String vastuString = String.valueOf(vastus);
		return vastuString;
	  } catch(Exception e){
		 return "Viga: "+e.getMessage();
	  }
	}
	

    public static void main(String[] args) {
		System.getProperties().put("server.port", 42580);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/Automaattestid-1.jar

//http://greeny.cs.tlu.ee:42580/algus