package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

public class Rakendus {
    
    //@RequestMapping("/rvl")
    static String sqrequ(String sqr, String lnr, String vbl) {
		/*if(sqr == null) {
            return "Ruutliige puudub";
		} else if(sisend.equals("")) {
            return "tyhi sisend";
        }*/
        
        Float a = Float.parseFloat(sqr);
        Float b = Float.parseFloat(lnr);
        Float c = Float.parseFloat(vbl);
        
        Float diskr = b*b-4*a*c;
        Double lah1 = (-b+Math.sqrt(diskr))/(2*a);
        Double lah2 = (-b-Math.sqrt(diskr))/(2*a);
        //String x1 = valueOf(lah1);
        //String x2 = valueOf(lah2);
        
        return "x1 = " + lah1 + " ja x2 = " + lah2;
        
	}
	
	public static void main(String[] args) {
        /*System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);*/
        System.out.println(sqrequ("2" ,"5", "2"));
	}
	
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
