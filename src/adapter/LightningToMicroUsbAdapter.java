package adapter;


public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	private final LightningPhone lightningPhone;

	public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}

	@Override
	public void useMicroUsb() {
		System.out.println("MicroUsb connected");
		lightningPhone.useLightning();
	}

	@Override
	public String recharge() {
		return lightningPhone.recharge();
	}
}
