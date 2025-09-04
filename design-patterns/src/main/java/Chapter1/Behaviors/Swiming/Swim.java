package Chapter1.Behaviors.Swiming;

import Chapter1.Interfaces.ISwimBehavior;

public class Swim implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("I'm swimming!!");
    }
}
