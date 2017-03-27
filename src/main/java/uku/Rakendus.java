package uku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
public class Rakendus {
	
	String vastus(String sisend1,String sisend2){
		
		if(sisend1==null){return "sisend puudub";}
		if(sisend1.equals("")){return "tyhi sisend";}
		int eap = Integer.parseInt(sisend1);
		double hinne = Double.parseDouble(sisend2);
		if(eap>=30 || hinne>=4.0){return "saad stippi";}
		if(eap<30){return "ei saa stippi";}
		return sisend1;
	}

	
	
   public static void main(String[] args) {
      Rakendus r=new Rakendus();
	  
   }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
