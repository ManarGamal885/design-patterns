package Chapter12.Test;

import Chapter12.Controller.BeatController;
import Chapter12.Controller.ControllerInterface;
import Chapter12.Model.BeatModel;
import Chapter12.Model.BeatModelInterface;

public class DJTestDrive {
    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
