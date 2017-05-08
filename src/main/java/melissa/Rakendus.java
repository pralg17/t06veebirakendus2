package melissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
    @Autowired
    private LiigiHaldur liigiHaldur;

    @RequestMapping("/leia")
	public String leia(String liik){
	   Liik loom=liigiHaldur.findOne(liik);
	   return "Looma "+liik+" nähti eelmine aasta looduses "+loom.nähtikorda+ " isendit.";
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 5555);
        SpringApplication.run(Rakendus.class);
    }
}