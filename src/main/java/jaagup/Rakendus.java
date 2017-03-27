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
        if((vbl == null || vbl.equals("") || vbl.equals("0")) && (lnr == null || lnr.equals("") || lnr.equals("0"))){
            return "x1 = x2 = 0.0";
            
        } else if(sqr == null || sqr.equals("") || sqr.equals("0")) {
            return "Tegemist pole ruutvõrrandiga";
            
        } else if(lnr == null || lnr.equals("") || lnr.equals("0")) {
            Float a = Float.parseFloat(sqr);
            Float c = Float.parseFloat(vbl);
        
            Float lahRuut = -c/a;
            if(lahRuut < 0) {
                return "Reaalarvulised lahendid puuduvad";
                
            }
            Double lah1 = Math.sqrt(lahRuut);
            Double lah2 = -Math.sqrt(lahRuut);
            
            return "x1 = " + lah1 + " ja x2 = " + lah2;
            
        } else if(vbl == null || vbl.equals("") || vbl.equals("0")) {
            Float a = Float.parseFloat(sqr);
            Float b = Float.parseFloat(lnr);
            
            
            Double lah1 = 0.0;
            Float lah2 = -b/a;
            
            return "x1 = " + lah1 + " ja x2 = " + lah2;
            
        } else {
            Float a = Float.parseFloat(sqr);
            Float b = Float.parseFloat(lnr);
            Float c = Float.parseFloat(vbl);
            
            Float diskr = b*b-4*a*c;
            if(diskr == 0) {
                Double lah1 = (-b+Math.sqrt(diskr))/(2*a);
                return "x1 = x2 = " + lah1;
                
            } else if(diskr < 0) {
                return "Reaalarvulised lahendid puuduvad";
                
            } else {
                Double lah1 = (-b+Math.sqrt(diskr))/(2*a);
                Double lah2 = (-b-Math.sqrt(diskr))/(2*a);
                return "x1 = " + lah1 + " ja x2 = " + lah2;
            }
        }
        
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
