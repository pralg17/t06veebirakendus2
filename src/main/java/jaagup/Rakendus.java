package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Rakendus {
	
	 String codeTests(String code) {
        if (code == null) {
            code = "Id is missing";

        } else if (code.equals("")) {
            code = "Id is empty";

        } else if (code.length() == 11) {
            code = "Id must be 11 characters";

        }

        return code;
    }
	
	String maleOrFemale(String code){
		String kood = code.substring(0,1);
		
		if (kood.equals("3")||kood.equals("5")||kood.equals("1")){
			code = "This is a man's id code";		
		}else if (kood.equals("4")||kood.equals("6")||kood.equals("2")){
			code = "This is a woman's id code";
		}
		
		return code;

			
	}

   
	
	public static void main(String[] args) {
        Rakendus rakendus = new Rakendus();
    }
}


//scl enable rh-maven33 bash
//mvn package
//java -jar target/testimine-1.jar