package Jan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Rakendus {

    @RequestMapping("/ruutjuur")
    String ruutjuur(int juur){
        try{

            return String.valueOf(Math.sqrt(juur));
        } catch (Exception e){
            return "Viga: "+e.getMessage();
        }
    }

    public static void main(String[] args){
        System.getProperties().put("server.port", 4217);
        SpringApplication.run(Rakendus.class, args);
    }
}


//http://localhost:4217/ruutjuur?juur=250000
//500.0