package TemplateMethod;

public class BusinessAccountCreator extends AccountCreator{
	@Override
	public void generateAccountNumber() {
		System.out.println("Business Account generated!\n");
	}
	
}
