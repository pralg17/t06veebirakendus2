package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
public class Rakendus {
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	 String keskmine(String sisend) {
		if(sisend==null){return "Sisend puudub";}
		if(sisend.equals("")){return "tyhi sisend";}
	   return sisend;
   }
   @RequestMapping("/tervita")
   
   String tervist(String eesnimi){
	   if(eesnimi==null){return "eesnimi puudub";}
		return "Tere,"+eesnimi;
   }
   
    String tervist2(String eesnimi, String perenimi){
		if(eesnimi==null){return "Eesnimi puudub";}
		if(perenimi==null){return "Perenimi puudub";}
		String PNimi = eesnimi.substring(0);
		return "Tere, kodanik "+eesnimi+" "+perenimi.substring(0,1);
	}
	
	String tervist3(String synnipaev, String synnikuu, String synniaasta){
		if(synnipaev==null){return "synnipaev puudub";}
		if(synnikuu==null){return "synnikuu puudub";}
		if(synniaasta==null){return "synniaasta puudub";}
		return "Teie synnipaev on "+synnipaev+"."+synnikuu+"."+synniaasta;
	}

   public static void main(String[] args) {
      Rakendus r=new Rakendus();
      System.out.println(r.tervitusfunktsioon());
   }
   

   
   

}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
