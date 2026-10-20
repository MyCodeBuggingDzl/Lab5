import org.example.SmartDevice;

public class SmartPhone extends SmartDevice implements Chargeable, Connectable {

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void performMainAction() {
        System.out.println(getBrand() + " " + getModel() + " is making a phone call.");
    }

    public void makeCall(String number) {
        System.out.println(getBrand() + " " + getModel() + " is calling " + number + "...");
    }

    @Override
    public void charge() {
        System.out.println("SmartPhone is charging.");
    }

    @Override
    public void connectToWifi() {
        System.out.println("SmartPhone connected to WiFi.");
    }

}
