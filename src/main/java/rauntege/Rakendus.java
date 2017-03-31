package rauntege;

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
		if(eesnimi==null){
			return "Nimi puudub";
		}
		if(eesnimi.length()==0){
			return "Nime pikkus on 0";
		}
		return "Tere, "+eesnimi;
	}

	boolean kasSobivLinn(String linn){
		return linn.equals("tallinn","berlin","moscow")
	}
	
	//Rakendus, mis ütleb lüheima võimaliku marsruudi 2 linna vahel
	@RequestMapping("/distance")
	String distanceBetween(String city1, String city2){
		if(kasSobivLinn(city1) && kasSobivLinn(city2)){
			if(city1.equals("tallinn")){
				if(city2.equals("moscow")){
					return "Lüheim võimalik marsruut Tallinna ja Moskva vahel on 1041km pikk";
				}
				if(city2.equals("berlin")){
					return "Lüheim võimalik marsruut Tallinna ja Berliini vahel on 1530km pikk";
				}
			}
			if(city1.equals("berlin")){
				if(city2.equals("tallinn")){
					return "Lüheim võimalik marsruut Berliini ja Tallinna vahel on 1530km pikk";
				}
				if(city2.equals("moscow")){
					return "Lüheim võimalik marsruut Berliini ja Moskva vahel on 1818km pikk";
				}
			}
			if(city1.equals("moscow")){
				if(city2.equals("tallinn")){
					return "Lüheim võimalik marsruut Moskva ja Tallinna vahel on 1041km pikk";
				}
				if(city2.equals("berlin")){
					return "Lüheim võimalik marsruut Moskva ja Berliini vahel on 1818km pikk";
				}
			}
		} else {
			return "Kahjuks selliste linnade kohta info puudub!";
		}
	}
	
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 2171);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/turva-1.jar