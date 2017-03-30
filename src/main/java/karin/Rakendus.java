package karin;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class Rakendus {
	
	@RequestMapping("/keskmine")             //keskmine?hinne=a,5&eap=3;4
	public String keskmine(String hinne, String eap){
		ArrayList<Double> hinded = new ArrayList<>();
		ArrayList<Double> punktid = new ArrayList<>();
		if(hinne == null || hinne.equals("")){
			return "Hinne sisestamata";	
		}
		if(eap == null || eap.equals("")){
			return "Ainepunktid sisestamata";
		}
		
		String[] sisestatudHinded = hinne.split(";", -1);  //et ka tyhje l6pus arvestaks
		String[] sisestatudPunktid = eap.split(";", -1);
			
		if(sisestatudHinded.length != sisestatudPunktid.length){
			return "Igale hindele peab vastama ainepunkt";
		} else { 
			for(int i = 0; i < sisestatudHinded.length; i++){ 
				String h = hindeKontroll(sisestatudHinded[i]);
				String p = punktiKontroll(sisestatudPunktid[i]);
				if(h.length() < 5 && p.length() < 5){     //ainult vigadeta hinne/eap paarid
					hinded.add(Double.valueOf(h));
					punktid.add(Double.valueOf(p));	
				}
			}
		}
		try{
			double keskmine = kaalutudKeskmine(hinded, punktid);
			if(keskmine > -1.0){
				if(String.valueOf(keskmine).length() > 4){
					keskmine = Math.round(keskmine * 100.0) /100.0;  //4.237333....4.24
				}
				return (String.valueOf(keskmine));
			} else {
				return "Kaalutud keskmise arvutamine ei õnnestunud";
			}
		} catch(Exception ex){
			return ex.getMessage();
		}
	}
		
	   
	   //funktsioon et kontrollida sisestatud hinnet
	@RequestMapping("/hinded")
	public String hindeKontroll(String sisend){
		String hinne = "kontrollimata";
		if(sisend == null){
			return "Hinne sisestamata";
		} else {
			sisend = sisend.trim();
		}
		if(sisend.equals("")){
			return "Hinne sisestamata";
		} else {
			sisend = sisend.toUpperCase();
		}
			
		if(sisend.equals("A")){
			hinne = "5.0";   
		}
		else if(sisend.equals("B")){
			hinne = "4.0";
		}
		else if(sisend.equals("C")){
			hinne = "3.0";
		}
		else if(sisend.equals("D")){
			hinne = "2.0";
		}
		else if(sisend.equals("E")){
			hinne = "1.0";
		}
		else if(sisend.equals("F")){
			hinne = "0.0";
			
		}else {
			try{
				double number = Double.valueOf(sisend);
				if(number >= 0.0 && number < 5.01){
					if((number * 10) % 10 != 0){
						return"Hinded peavad olema täisarvud";
					}else{
					hinne = String.valueOf(number);
					}
				} else {
					return "Hinne peab olema vahemikus 0-5";
				}
			}catch(Exception ex){
				return "Siseta hinne kujul: A või 5";
			}	
		}
	return hinne;	
	}
	
	//funktsioon, et kontrollida sisestatud ainepunkti
	@RequestMapping("/punktid")
	public String punktiKontroll(String sisend){
		String eap = "kontrollimata";
		if(sisend == null){
			return "Ainepunktid sisestamata";
		} else {
			sisend = sisend.trim();
		}
		if(sisend.equals("")){
			return "Ainepunktid sisestamata";
		} else {
			try{
				double number = Double.valueOf(sisend);
				if(number < 21){
					if((number * 10) % 10 != 0){
						return"Ainepunktid peavad olema täisarvud";
					}else{
					eap = String.valueOf(number);
					}
				}else{
					return"Liiga suured ainepunktid";
				}
					
				if(number < 1){
					return"Ainepunkt peab nullist suurem olema";
				}
			}catch(Exception ex){
					return "Siseta ainepunktid kujul: 4";
			}
		}
	return eap;
	}
	  
	//Arvuta kaalutud keskmine
	public double kaalutudKeskmine(ArrayList<Double> hinded, ArrayList<Double> punktid){
		double hinneKordaEapSumma = 0;
		double eapKokku = 0;
		double keskmine = -1.0;
		try{
			for(int i = 0; i < hinded.size(); i++){
				hinneKordaEapSumma += hinded.get(i) * punktid.get(i);
				eapKokku += punktid.get(i);
			}
			keskmine = hinneKordaEapSumma / eapKokku;
		}catch(Exception ex){}
		return keskmine;
	}
	
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 2412);
        SpringApplication.run(Rakendus.class, args);	
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/kodune-0.0.1-SNAPSHOT.jar


	