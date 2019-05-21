package main;

public class Account {
	private String firstName;
	private String lastName;
	private int accountNumber;

	public Account() {
		firstName = "";
		lastName = "";
	}

	public void setFirstName(String customerFirstName) {
		customerFirstName = firstName;

	}

	public String getFirstName() {
		return firstName;
	} 

	public void setLastName(String customerLastName) {
		customerLastName = lastName;

	}

	public String getLastName() {
		return lastName;
	}

	public void setAccountNumber(int customerAccountNumber) {
		customerAccountNumber = accountNumber;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

}
