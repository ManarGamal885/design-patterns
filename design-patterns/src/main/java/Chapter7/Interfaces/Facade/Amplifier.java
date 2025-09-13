package Chapter7.Interfaces.Facade;

public class Amplifier {
    public void on(){
        System.out.println("Amplifier on");
    }
    public void setVolume(int level) {
        System.out.println("Amplifier setting volume to " + level);
    }
    public void off() {
        System.out.println("Amplifier off");
    }
}
