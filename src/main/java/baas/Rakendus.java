//http://docs.spring.io/spring-data/jpa/docs/current/reference/html/
package t06veebirakendus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController

public class Rakendus {
	
	@Autowired
	private FilmideHaldur haldur;
	
	//loen kokku, mitu filmi andmebaasis on
	@RequestMapping("/kokkulugemine")
	public String lugemine1(){	
		return "Andmebaasis on "+haldur.count() + " filmi";
	}
	
	//otsin andmebaasist ühe olemasoleva filmi ja küsin selle kohta infot: mis aasta film on ja kui palju on raha teeninud Ameerikas
	//Näide: http://localhost:5555/filmiuuring?filmName=Logan
	//Vastus: Logan on aasta 2017 film ja on teeninud 88411916dollarit Ameerikas
	@RequestMapping("/filmiuuring")
	public String uuring1(String filmName){
		if(filmName==null){
			return "Et otsida, peab olema ka lisatud filmi nimi";
		}
		Filmid film=haldur.findOne(filmName);
		if(film==null){
			return filmName+"- Selline film puudub";
		}
		return filmName + " on aasta "+ film.aasta + " film ja on teeninud " + film.raha + " dollarit Ameerikas";
	}
	
	
	@RequestMapping("/loetelu")
	public String loetelu(){
		Iterable<Filmid> movie=haldur.findAllByOrderByRahaDesc();
		StringBuffer sb=new StringBuffer();
		for(Filmid k: movie){
			sb.append(k.nimi+" teenis "+k.raha+ " dollarit" +"<br />");
		}
		return sb.toString();
	}
	
	//http://localhost:5555/loetelu2?miinimum=100000000
	//Jason Bourne teenis 162434410 dollarit. Eelarve sellel filmil oli 97000000 dollarit.
	//The Martian teenis 228433663 dollarit. Eelarve sellel filmil oli 108000000 dollarit.
	@RequestMapping("/loetelu2")
	public String loetelu2(int miinimum){
		Iterable<Filmid> movie=haldur.findByRahaGreaterThan(miinimum);//Otsivad saldot, mis on suurem kui kasutaja poolt etteantud miinimum http://greeny.cs.tlu.ee:4207/loetelu8?miinimum=30
		StringBuffer sb=new StringBuffer();
		for(Filmid k: movie){
			sb.append(k.nimi+" teenis "+k.raha+ " dollarit.");
			for(Naitleja a: k.naitlejad){
				sb.append(" Eelarve sellel filmil oli "+a.eelarve+" dollarit.");
			}
			sb.append("<br />");
		}
		return sb.toString();
	}
	
	
	/*
	@RequestMapping("/loetelu2")
	public String loetelu2(int miinimum){
		Iterable<Filmid> movie=haldur.findByRahaGreaterThan(miinimum);//Otsivad saldot, mis on suurem kui kasutaja poolt etteantud miinimum http://greeny.cs.tlu.ee:4207/loetelu8?miinimum=30
		StringBuffer sb=new StringBuffer();
		for(Filmid k: movie){
			sb.append(k.nimi+" teenis "+k.raha+ " dollarit" +"<br />");
			for(Naitleja a: k.naitlejad){
				sb.append(" ("+a.nNimi+")");
			}
			sb.append("<br />");
		}
		return sb.toString();
	}
	*/
	
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4207);
		System.getProperties().put("spring.datasource.url", 
		   "jdbc:mysql://localhost:3306/if16_mattbleh_2?useSSL=false");
		//System.getProperties().put("spring.datasource.maxActive", "2"); //Aiunult siis vaja	kui oled arvutiklassis
		System.getProperties().put("spring.datasource.username", "if16");
		System.getProperties().put("spring.datasource.password", "ifikad16");
		SpringApplication.run(Rakendus.class);
	}
}