package adapter;


public class Iphone implements LightningPhone {
	private boolean isConnected;

	@Override
	public void useLightning() {
		isConnected = true;
		System.out.println("Lightning connected");
	}

	@Override
	public String recharge() {
		if (isConnected) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
			return "Recharge finished";
		} else {
			System.out.println("Connect Lightning first");
			return "Connect Lightning first";
		}
	}
}
