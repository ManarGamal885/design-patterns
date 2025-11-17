package Chapter12.Model;

import Chapter12.Observers.Interfaces.BPMObserver;
import Chapter12.Observers.Interfaces.BeatObserver;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BeatModel implements BeatModelInterface, Runnable{
    List<BeatObserver> beatObservers = new ArrayList<>();
    List<BPMObserver> bpmObservers = new ArrayList<>();

    // Clip Details
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    // Initializing the clip
    @Override
    public void initialize() {
        try {
            System.out.println("Attempting to load audio clip...");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));

            java.net.URL audioURL = getClass().getResource("/clap.wav");
            if (audioURL == null) {
                System.out.println("ERROR: Could not find clap.wav");
                return;
            }
            System.out.println("Found audio file at: " + audioURL);

            clip.open(AudioSystem.getAudioInputStream(audioURL));
            System.out.println("Audio clip loaded successfully!");

        } catch(Exception ex) {
            System.out.println("Error: Can't load clip");
            ex.printStackTrace();
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();

        if (clip == null) {  // FIXED: Initialize clip if not already done
            initialize();
        }

        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return this.bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    public void stopBeat(){
        if (clip != null) {  // FIXED: Added null check
            clip.setFramePosition(0);
            clip.stop();
        }
    }

    public void playBeat(){
        if (clip != null) {  // ADDED: Safety check
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void notifyBeatObservers(){
        for (int i = 0; i < beatObservers.size(); i++) {
            BeatObserver observer = beatObservers.get(i);
            observer.updateBeat();
        }
    }

    public void notifyBPMObservers(){
        for (int i = 0; i < bpmObservers.size(); i++) {
            BPMObserver observer = bpmObservers.get(i);
            observer.updateBPM();
        }
    }

    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000/getBPM());
            } catch (Exception e) {}
        }
    }
}