package main;

import java.util.HashMap;
import java.util.Map;
//import org.json.JSONObject;

import com.google.gson.Gson;

public class AccountApplication {

	static Map<Integer, Account> accounts = new HashMap<>();

	public AccountApplication() {

	}

	public static void main(String abc[]) {
		System.out.println("Hello world to the standard out");

		Service serv = new Service();
		Account newacc = new Account();
		
		newacc.setAccountNumber(123);
		newacc.setFirstName("Linda");
		newacc.setLastName("Biasua");
		serv.addAccount(newacc);
		System.out.println(new Gson().toJson(AccountApplication.accounts));
	}
}
