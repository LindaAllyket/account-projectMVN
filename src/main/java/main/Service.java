package main;
//import main.AccountApplication;

//import org.json.JSONObject;

public class Service {
	public int count;
	
	 
	
	public void addAccount(Account account) {
		AccountApplication.accounts.put(count++, account);
		
	}
	
	public void getAccount(int num) {
		AccountApplication.accounts.get(num);
	}
	
//	static public void convertToJSON() {
//		  JSONObject json = new JSONObject(); 			
//	}
	
	
}
	
