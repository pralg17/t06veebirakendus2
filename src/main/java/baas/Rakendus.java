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
	
	
	@RequestMapping("/loetelu")
	public String loetelu(){
		Iterable<Filmid> movie=haldur.findAllByOrderByRahaDesc();
		StringBuffer sb=new StringBuffer();
		for(Filmid k: movie){
			sb.append(k.nimi+" teenis "+k.raha+ " dollarit." +"<br />");
		}
		return sb.toString();
	}
	
	/*
	@RequestMapping("/loetelu3")
	public String loetelu3(){
		Iterable<Filmid> movie=haldur.findByNimiLike("m%");//otsib tähe "o"
		StringBuffer sb=new StringBuffer();
		for(Filmid k: movie){
			sb.append(k.nimi+" teenis "+k.raha+ " dollarit" +"<br />");
		}
		return sb.toString();
	}
	*/
	
	
	//http://localhost:5555/loetelu2?miinimum=10000000
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