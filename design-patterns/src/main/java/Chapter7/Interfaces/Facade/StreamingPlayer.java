package Chapter7.Interfaces.Facade;

public class StreamingPlayer {
    public void on(){
        System.out.println("Streaming Player on");
    }
    public void play(String movie){
        System.out.println("Playing movie: " + movie);
    }
    public void stop(){
        System.out.println("Stopping movie");
    }
    public void off() {
        System.out.println("Streaming Player off");
    }
}
