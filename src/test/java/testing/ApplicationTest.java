package testing;

import org.junit.Test;

import com.google.gson.Gson;

import main.Account;
import main.AccountApplication;
import main.Service;

public class ApplicationTest {
	
	@Test
	public void testScanAccounts() {
		AccountApplication accountapplication = new AccountApplication();
		Service serv = new Service();
		Account newacc = new Account();  
		serv.addAccount(newacc);
		new Gson().toJson(accountapplication.accounts);
		for (int i=0; i<=(serv.count);i++){
			System.out.print(s);
		}
		
		
	}
}
