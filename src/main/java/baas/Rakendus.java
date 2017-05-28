package baas;

 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.beans.factory.annotation.Autowired;
 @RestController
 @SpringBootApplication
 public class Rakendus {
 	@RequestMapping("/varjupaigaleht")
  	public String varjupaik(String loom, String varjupaik, String kiibikood ){
 		   return "Kass/Koer nimega "+loom+ "asub " + varjupaik+ " varjupaigas. Tema kiibikood " + kiibikood;
  	}

  	@RequestMapping("/kiibikood")
  	public String kood(String kiibikood){
  		if (kiibikood.length()==5){
  			return kiibikood;
  		} else {
  			return "Ei sobi";
  		}
  	}
     public static void main(String[] args) {
 		System.getProperties().put("server.port", 4234);
         SpringApplication.run(Rakendus.class, args);
     }
 }

 //scl enable rh-maven33 bash
 //mvn package
 //java -jar target/app-1.jar
