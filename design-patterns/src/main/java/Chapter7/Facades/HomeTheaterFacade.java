package Chapter7.Facades;

import Chapter7.Interfaces.Facade.*;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer streamingPlayer;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer streamingPlayer) {
        this.amp = amp;
        this.tuner = tuner;
        this.streamingPlayer = streamingPlayer;
    }

    // Watch a movie
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        streamingPlayer.on();
        streamingPlayer.play(movie);
        amp.on();
        amp.setVolume(5);
    }

    // End the movie
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        streamingPlayer.stop();
        streamingPlayer.off();
        amp.off();
    }
}
