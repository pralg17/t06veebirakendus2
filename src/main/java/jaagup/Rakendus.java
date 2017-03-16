package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
public class Rakendus {



    String idCode(String code){
         if (code == null)
        {
            code = "Id is missing";
        }
        else if (code.equals(""))
        {
            code ="Id is empty";
        }

        else if(code.length() == 11)
        {
            code ="Id must be 11 characters";
        }

        return code;
    }

   public static void main(String[] args) {
      Rakendus r=new Rakendus();
   }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
