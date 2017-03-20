package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController

public class Rakendus1 {


  @Autowired
  private KasutajateHaldur haldur;

  @RequestMapping("/loetelu1")
  public String loetelu1(){
    Iterable<Kasutaja> autod=haldur.findAll();
    StringBuffer sb = new StringBuffer();
    for(Kasutaja k: autod){
      sb.append(k.omanik+"-"+k.voimsus+"kW<br />");
    }
    return sb.toString();
  }

  @RequestMapping("/loetelu2")
  public String loetelu2(){
    Iterable<Kasutaja> autod=haldur.findAllByOrderByVoimsusDesc();
    StringBuffer sb = new StringBuffer();
    for(Kasutaja k: autod){
      sb.append(k.omanik+"-"+k.voimsus+"kW<br />");
    }
    return sb.toString();
  }

  @RequestMapping("/loetelu3")
  public String loetelu3(){
    Iterable<Kasutaja> autod=haldur.findTop2ByOrderByVoimsusDesc();
    StringBuffer sb = new StringBuffer();
    for(Kasutaja k: autod){
      sb.append(k.omanik+"-"+k.voimsus+"kW<br />");
    }
    return sb.toString();
  }

  @RequestMapping("/loetelu4")
  public String loetelu4(){
    Iterable<Kasutaja> autod=haldur.findByOmanikLike("j%");
    StringBuffer sb = new StringBuffer();
    for(Kasutaja k: autod){
      sb.append(k.omanik+"-"+k.voimsus+"kW<br />");
    }
    return sb.toString();
  }
/*
  @RequestMapping("/loetelu5")
  public String loetelu5(){
    Iterable<Kasutaja> autod=haldur.findByVoimsusGreaterThan(number);
    StringBuffer sb = new StringBuffer();
    for(Kasutaja k: autod){
      sb.append(k.omanik+"-"+k.voimsus+"kW<br />");
    }
    return sb.toString();
  }
*/

@RequestMapping("/loetelu7")
public String loetelu7(int number){
  Iterable<Kasutaja> autod=haldur.findByVoimsusGreaterThan(number);
  StringBuffer sb = new StringBuffer();
  for(Kasutaja k: autod){
    sb.append(k.omanik+"-"+k.voimsus+"kW");
    for(Kiirendus a: k.kiirendused){
      sb.append(" ("+a.aeg+") ");
    }
    sb.append("<br />");
  }
  return sb.toString();
}



  @RequestMapping("/tervitusleht1")
   public String tervitus1(String eesnimi) {

       return "Tere, "+eesnimi+"!";
   }


    public static void main(String[] args) {
      System.getProperties().put("server.port", 4302);
      System.getProperties().put("spring.datasource.url","jdbc:mysql://localhost:3306/if16_kentloog?useSSL=false");
      System.getProperties().put("spring.datasource.maxActive", "2");
      System.getProperties().put("spring.datasource.username", "if16");
      System.getProperties().put("spring.datasource.password", "ifikad16");

        SpringApplication.run(Rakendus1.class);
    }
}
