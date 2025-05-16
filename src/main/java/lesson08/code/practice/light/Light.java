package lesson08.code.practice.light;

public class Light {

    private String location;
    private int brightness;
    private boolean isOn;

    public Light(String location) {
        this.location = location;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getLocation() {
        return location;
    }
}
