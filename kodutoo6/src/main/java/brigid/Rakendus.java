package brigid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
    @Autowired
    private VoistlejaHaldur voistlejaHaldur;

    @RequestMapping("/leia")
	public String leia(String nimi){
	   Voistleja isik=voistlejaHaldur.findOne(nimi);
	   return "Võistleja "+nimi+" pallivisketulemus on "+isik.pallivisketulemus;
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 5555);
        SpringApplication.run(Rakendus.class);
    }
}

// scl enable rh-maven33 bash
// mvn package
// java -jar target/sql-0.0.1-SNAPSHOT.jar
