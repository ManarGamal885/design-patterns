package Chapter12.Utilities;

import javax.swing.*;
import java.awt.*;

public class BeatBar extends JProgressBar {

    public BeatBar() {
        super();
        setMinimum(0);
        setMaximum(100);
        setValue(0);
        setStringPainted(true); // optional: show percentage
        setForeground(Color.RED); // color of the bar
    }

    // Called whenever the beat happens
    public void beat() {
        // Flash the bar for a moment
        setValue(100); // full
        // Use a timer to reset back to 0 after a short delay
        Timer timer = new Timer(100, e -> setValue(0)); // 100 ms
        timer.setRepeats(false);
        timer.start();
    }

    // Optionally, set value manually
    public void setBeatValue(int value) {
        setValue(value);
    }
}
