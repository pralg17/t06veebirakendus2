package Chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

public class Rakendus{
	
	String BankAccount(String account_nr){
		
		if(account_nr == null){
			account_nr = "Missing data";
		}
		
		else if(account_nr.equals("")){
			account_nr = "No data was entered";
		}
		
		else if(account_nr.length() == 20){
			account_nr = "The bank account must be 20 characters long";
		}
		
		return account_nr;
		
	}

	public static void main(String[] args){
		
		Rakendus r = new Rakendus();
	
	}
	
}