package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Rakendus {
	
	 String idCode(String code) {
        if (code == null) {
            code = "Id is missing";

        } else if (code.equals("")) {
            code = "Id is empty";

        } else if (code.length() == 11) {
            code = "Id must be 11 characters";

        }

        return code;
    }

    String IdCodeFirstNumber(String code) {
        String temp = code.substring(0, 1);

        if (temp.equals("3") || temp.equals("4") || temp.equals("5") || temp.equals("6")) {
            code = "First character must be 3 - 6";

        }
        return code;
    }
	
	public static void main(String[] args) {
        Rakendus r = new Rakendus();
    }
}


//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar