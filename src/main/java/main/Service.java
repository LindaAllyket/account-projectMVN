package main;
//import main.AccountApplication;
//import java.util.Map;

import org.json.JSONObject;

public class Service {
	private int count;
	static JSONObject json = new JSONObject();
	 
	
	public void addAccount(Account account) {
		AccountApplication.accounts.put(count++, account);
		
	}
	
	public void getAccount(int num) {
		AccountApplication.accounts.get(num);
	}
	
	
}
	
