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
    private LiigiHaldur liigiHaldur1;

    @RequestMapping("/leia")
	public String leia(String liik){
	   Liik loom=liigiHaldur1.findOne(liik);
	   return "Looma "+liik+" nähti eelmine aasta looduses "+loom.nähtikorda+ " isendit.";
	}

    public static void main(String[] args) {
		System.getProperties().put("server.port", 4217);
		System.getProperties().put("spring.datasource.url", "jdbc:mysql://localhost/if16_melissab?useSSL=false");
		System.getProperties().put("spring.datasource.username", "if16");
		System.getProperties().put("spring.datasource.password", "ifikad16");
        SpringApplication.run(Rakendus.class);
    }
}