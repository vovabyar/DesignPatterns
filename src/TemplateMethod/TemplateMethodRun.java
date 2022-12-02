package TemplateMethod;

public class TemplateMethodRun {
	public static void main(String[] args) {
		AccountCreator acc = new BusinessAccountCreator();
		acc.createAccount();
		AccountCreator priv = new PrivateAccountCreator();
		priv.createAccount();
	}
}
