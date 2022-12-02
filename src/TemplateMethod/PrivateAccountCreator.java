package TemplateMethod;

public class PrivateAccountCreator extends AccountCreator{
	@Override
	public void generateAccountNumber() {
		System.out.println("Private Account generated!\n");
	}
	
}
