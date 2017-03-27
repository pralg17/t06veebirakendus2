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
			return account_nr;
		}
		
		return account_nr;
		
	}
	
	String BankAccountNCode(String account_nr){
		
		String N_code_Estonia = account_nr.substring(0, 2);
		
		if(N_code_Estonia.equals("EE")){
			account_nr = "The bank account must contain it's nation code(EE)";
			return account_nr;
		}
		
		return account_nr;
		
	}
	
	String BankAccountBCode(String account_nr){
		
		String Bank_code_SEB = account_nr.substring(4, 6);
		
		if(Bank_code_SEB.equals("10")){
			account_nr = "The bank account must contain it's bank code (SEB bank)";
			return account_nr;
		}
		
		return account_nr;
		
	}

	public static void main(String[] args){
		
		Rakendus r = new Rakendus();
	
	}
	
}