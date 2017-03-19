package Chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

public class Rakendus{
	

	String k_ymbermoot(String kylg1, String kylg2, String kylg3){
	
		String ymbermoot = kylg1 + kylg2 + kylg3;
	
		if(kylg1.equals("") || kylg2.equals("") || kylg3.equals("")){
			return "Empty data";
		}
	
		if(kylg1 == null || kylg2 == null || kylg3 == null){
			return "Data input is missing";
		}
	
		return ymbermoot;
}

	public static void main(String[] args){
		
		Rakendus r = new Rakendus();
	
	}
	
}