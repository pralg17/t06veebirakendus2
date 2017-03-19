package Chris;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void BankATest(){
		
		Rakendus r = new Rakendus();
		
		String account_nr = "EE9099001234567890124";
		
		//Tests to see if any data was entered
		assertEquals("Missing data", r.BankAccount(null));
		assertEquals("No data was entered", r.BankAccount(""));
		
		//Test to see if the bank account is 20 characters long
		assertEquals("The bank account must be 20 characters long", r.BankAccount(account_nr));
		
	}
	
}