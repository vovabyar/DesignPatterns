package adapter;


public class AdapterRun {
    public static String rechargeMicroUsbPhone(MicroUsbPhone microUsbPhone) {
        microUsbPhone.useMicroUsb();
        return microUsbPhone.recharge();
    }

    public static void main(String[] args) {
        Android android = new Android();
        String androidRechargeResult = rechargeMicroUsbPhone(android);
        Iphone iPhone = new Iphone();
        //rechargeMicroUsbPhone(iPhone);
        String iphoneWithMicroUsbRechargeResult = rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));
//        log.info("iphoneWithMicroUsbRechargeResult={}", iphoneWithMicroUsbRechargeResult);
//        assertEquals("Recharge finished", iphoneWithMicroUsbRechargeResult);
    }
}
