import org.example.SmartDevice;

public class Main {

    public static void main(String[] args) {

        SmartDevice d1 = new SmartPhone("Apple", "iPhone");
        SmartDevice d2 = new SmartSpeaker("Google", "Nest");

        d1.showBasicInfo();
        d1.performMainAction();

        d2.showBasicInfo();
        d2.performMainAction();




        SmartPhone phone = new SmartPhone("Apple", "iPhone");
        SmartSpeaker speaker = new SmartSpeaker("Google", "Nest");

        testCharging(phone);

        //SmartPhone implemented Chargeable, so its "is a" relationship.
    }

    public static void testCharging(Chargeable device) {
        device.charge();
    }
}
