package johan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/ost")
	public String aktsia(String nimi, String kogus, String hind){
		return "Ostsite: " + kogus + " " + nimi + " aktsiat hinnaga " + hind + " eurot tukk";
	}

	@RequestMapping("/otsimine")
	public String otsi(String id){
		if(id.length()==5){
			return id;
		}else{
			return "Antud " + id + " aktsiat ei ole";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.getProperties().put("server.port", 4420);
	}
}
