package karolmilaine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Rakendus {


    String dayCode(String code) {
        if (code == null) {
            code = "Day is missing";

        } else if (code.equals("")) {
            code = "Day is empty";
        }
        return code;
    }

    String DayCodeInserted(String code) {
        String temp = code.substring(0);

        if (temp.equals("Monday") || temp.equals("Tuesday") || temp.equals("Wednesday") || temp.equals("Thursday") || temp.equals("Friday") || temp.equals("Saturday") || temp.equals("Sunday")) {
            code = "Enter a day";

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
