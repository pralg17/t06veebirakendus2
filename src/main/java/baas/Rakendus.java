package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class Rakendus{
  @Autowired
  private Opilastehaldur haldur;

  @RequestMapping("/loetelu1")
  public String loetelu1(){
    Iterable<Opilased> opilased=haldur.findAll();
    StringBuffer sb=new StringBuffer();
    for(Opilased k: opilased){
      sb.append("Nimi: "+k.nimi+" - Matriklinr: "+k.martiklinumber);
      for(Ained a: k.ained){
       sb.append(" Aine nimetus: " + a.aine);
     }
     sb.append("<br />");
    }
    return sb.toString();
  }

  @RequestMapping("/loetelu2")
   public String loetelu2(){
     Iterable<Opilased> opilased=haldur.findAllByOrderByMartiklinumberAsc();
     StringBuffer sb = new StringBuffer();
     sb.append("Tudengid järjestatud alates sisseastumise aastast<br />");
     for(Opilased k: opilased){
       sb.append("Nimi: "+k.nimi+" - Matriklinr: "+k.martiklinumber+"<br />");
     }
     return sb.toString();
   }


	public static void main(String[] args) {
    System.getProperties().put("server.port", "1717");
    System.getProperties().put("spring.datasource.url", "jdbc:mysql://localhost:3306/if16_karroo?useSSL=false");
    System.getProperties().put("spring.datasource.maxActive", "2");
    System.getProperties().put("spring.datasource.username", "if16");
    System.getProperties().put("spring.datasource.password", "ifikad16");
		SpringApplication.run(Rakendus.class);
	}
}
