package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class Rakendus {
	@Autowired
	private ArtistiHaldur haldur;
	
	
	
	@RequestMapping("/loetelu")
	public String find(int artistinimi){
		if(artistinimi == 0){
			return "Artist puudub";
			
		}
		Artistid artist=haldur.findOne(artistinimi);
			if(artist == 0){
				return "Artisti ei ole andmebaasis";
			}
			return "Artisti nimi: " + artistinimi + "</br>Artisti stiil: " + artist.stiil + "</br>Artisti sünnikoht: " + artist.synnikoht + "</br>Artisti sünniaasta: " + artist.synniaasta + "</br>Tegev aastast: " + artist.tegev;
	}
	
	
	
	
	@RequestMapping("/list")
	public String list(){
		Iterable<Artistid> artistid=haldur.findAllByOrderBySynniaastaDesc();
		StringBuffer sb=new StringBuffer();
		for(Artistid k: artistid){
			sb.append("Synniaasta: " + k.synniaasta + "<br />");
		}
		return sb.toString();
	}
	
	@RequestMapping("/showall")
	public String showall(){
		Iterable<Artistid> artistid=haldur.findAll();
		StringBuffer sb=new StringBuffer();
		for(Artistid k: artistid) {
			sb.append(k.artistinimi+": "+k.stiil+", sünnikoht- "+k.synnikoht+", sünniaasta- "+k.synniaasta+", tegev aastast "+k.tegev+"."+"<br />");
		
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 1721);
		System.getProperties().put("spring.datasource.url", 
		   "jdbc:mysql://localhost/if16_jaagup_3");
		System.getProperties().put("spring.datasource.maxActive", "2");
		System.getProperties().put("spring.datasource.username", "if16");
		System.getProperties().put("spring.datasource.password", "ifikad16");
		SpringApplication.run(Rakendus.class);
	}
}



// scl enable rh-maven33 bash
//dir pom/xml
// mvn package
// java -jar target/t05veebirakendus-0.0.1-SNAPSHOT.jar