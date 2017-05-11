package tatjkuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
    @Autowired
    private VarviHaldur haldur;

    @RequestMapping("/otsimine")
	public String otsimine(String nimi){
	   Varvid varv=haldur.findOne(nimi);
	   return "Värvi nimetus on "+nimi+" ja selle hex kood on  "+varv.hexkood;
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 5678);
        SpringApplication.run(Rakendus.class);
    }
}
