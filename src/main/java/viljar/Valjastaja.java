package viljar;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Valjastaja {

  @RequestMapping("/palk")
    String liitja(String eesnimi, String perenimi, double tunnitasu,double tooaeg ){
      return "Nimi: "+ eesnimi+" "+perenimi+ " Saab sellel kuul palka Brutos " +
      new Arvuta().Arvutapalk(tunnitasu,tooaeg)+
      ". Netos aga: " + new Arvuta().Arvutakatte(tunnitasu, tooaeg)+
      " Tööandja maksab: "+ new Arvuta().ArvutaKulu(tunnitasu,tooaeg);
    }

public static void main(String[] args)throws IOException{
  System.getProperties().put("server.port", 2497);
  SpringApplication.run(Valjastaja.class, args);
}
}
