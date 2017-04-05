package Martin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication

public class Rakendus {
	//raamtu mapping koostamine	
	@RequestMapping("/raamat")
	public String raamat(String pealkiri, String autor, String isbn){
		   return "Raamat, "+pealkiri+ " " + autor + ", ISBN on " + isbn;
	}
	//isbn koostamine
	@RequestMapping("/isbn")
	public String isbn(String isbn){
		if (isbn.length()==13){
			return isbn;
		} else {
			return "ei k6lba";
		}
	}
	//springboot teema	
    public static void main(String[] args) {
		//Rakendus uusRakendus = new Rakendus();
		System.getProperties().put("server.port", 2456);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/testimine-1.jar
