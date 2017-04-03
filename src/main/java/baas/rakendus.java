package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication

public class rakendus {
  @Autowired
  private kasutajahaldur haldur;


  @RequestMapping("/rahauuring")
  public String uuring1(String knimi){
    kasutaja k = haldur.findOne(knimi);
    if (k==null) {
      return knimi+ " puudub";
    }
    return knimi+" laen: "+k.laen+" tasutud: "+k.tasutud;
  }

  @RequestMapping("/inkasso")
  public String inkasso(String knimi, float tasumine){
    if (knimi==null) {return "kasutaja määramata";}

    kasutaja k = haldur.findOne(knimi);
    if (k==null) {return knimi+ " puudub";}

    k.tasutud=k.tasutud+tasumine;
    haldur.save(k);
    return uuring1(knimi);
  }

  @RequestMapping("/laenuuuring")
  	public String laenuuuring(){
  		Iterable<kasutaja> inkasso=haldur.findAll();
  		StringBuffer sb=new StringBuffer();
  		for(kasutaja k: inkasso){
  			sb.append("Nimi: "+k.nimi+" Laenatud summa: "+k.laen+" Tagasi makstud: "+k.tasutud+"<br />");
  		}
  		return sb.toString();
  	}

    @RequestMapping("/laenuuuring1")
	  public String laenuuuring1(){
    		Iterable<kasutaja> inkasso=haldur.findByNimiLike("t%");
    		StringBuffer sb=new StringBuffer();
    		for(kasutaja k: inkasso){
    			sb.append("Nimi: "+k.nimi+" Laenatud summa: "+k.laen+" Tagasi makstud: "+k.tasutud+"<br />");
    		}
		    return sb.toString();
	  }

    @RequestMapping("/laenuuuring2")
    public String laenuuuring2(float arv){
        Iterable<kasutaja> inkasso=haldur.findByLaenGreaterThan(arv);
        StringBuffer sb=new StringBuffer();
        for(kasutaja k: inkasso){
          sb.append("Nimi: "+k.nimi+" Laenatud summa: "+k.laen+" Tagasi makstud: "+k.tasutud+"<br />");
        }
        return sb.toString();
    }

  public static void main(String[] args){
      System.getProperties().put("server.port", 8080);
      System.getProperties().put("spring.datasource.url","jdbc:mysql://localhost:3306/if16_taneotsa_4?useSSL=false");
      System.getProperties().put("spring.datasource.maxActive", "2");
      System.getProperties().put("spring.datasource.username","if16");
      System.getProperties().put("spring.datasource.password","ifikad16");
    SpringApplication.run(rakendus.class);
  }
}

/*

tanel laen: 1000.0 tasutud: 10.0
tanel laen: 1000.0 tasutud: 110.0

malle laen: 500.0 tasutud: 0.0
*/
