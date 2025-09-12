package Chapter6.Receiver;

public class Light {
    public String name;
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("Light " + name +" is ON");
    }
    public void off() {
        System.out.println("Light " + name +" is OFF");
    }
}
