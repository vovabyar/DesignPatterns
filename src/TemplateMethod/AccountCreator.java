package TemplateMethod;

public abstract class AccountCreator {
	public void verifyApplicationDetails(){
		System.out.println("Verify Account details...");
	}
	
	public void verifyIdentificationDetails(){
		System.out.println("Verify the Identification Details...");
	}

	public abstract void generateAccountNumber();
	public void createAccount(){
		this.verifyApplicationDetails();
		this.verifyIdentificationDetails();
		this.generateAccountNumber();
	}
}
