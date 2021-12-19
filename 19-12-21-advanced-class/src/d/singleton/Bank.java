package d.singleton;

public class Bank {

	
	// 1. private CTOR
	
	private Bank() {
	}
	// 2. private static instance of bank
	
	private static Bank instance = new Bank();

	
	// 3. public static getter for the bank instance
	
	public static Bank getInstance() {
		return instance;
	}
	
	//================================
	
	private int numberofCostomers;
		
	public void addCustomer() {
		numberofCostomers++;
		
	}
	
	public void removeCustomer() {
		numberofCostomers--;
		
	}

	public int getNumberofCustomers() {
		return numberofCostomers;
	}
	
	 
	
	
}
