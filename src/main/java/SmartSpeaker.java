import org.example.SmartDevice;

public class SmartSpeaker extends SmartDevice implements Connectable {

    public SmartSpeaker(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void performMainAction() {
        System.out.println(getBrand() + " " + getModel() + " is playing music.");
    }

    public void playMusic(String song) {
        System.out.println(getBrand() + " " + getModel() + " is playing " + song);
    }

    @Override
    public void connectToWifi() {
        System.out.println("SmartSpeaker connected to WiFi.");
    }
}
