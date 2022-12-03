package adapter;


public class Android implements MicroUsbPhone {
	private boolean isConnected;

	@Override
	public void useMicroUsb() {
		isConnected = true;
		System.out.println("MicroUsb connected");
	}

	@Override
	public String recharge() {
		if (isConnected) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
			return "Recharge finished";
		} else {
			System.out.println("Connect MicroUsb first");
			return "Connect MicroUsb first";
		}
	}
}
