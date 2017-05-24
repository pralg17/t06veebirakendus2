package karolin;

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
/*-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running karolin.EsimeneTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 sec - in karolin.EsimeneTest

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.535 s
[INFO] Finished at: 2017-05-17T12:49:57+03:00
[INFO] Final Memory: 16M/225M
[INFO] ----------------------------------*/