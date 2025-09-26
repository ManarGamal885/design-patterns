package Chapter7.Test;

import Chapter7.Facades.HomeTheaterFacade;
import Chapter7.Interfaces.Facade.Amplifier;
import Chapter7.Interfaces.Facade.StreamingPlayer;
import Chapter7.Interfaces.Facade.Tuner;

public class FacadePattern {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer streamingPlayer = new StreamingPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, streamingPlayer);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
