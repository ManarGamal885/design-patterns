package Chapter1.Behaviors.Quacking;

import Chapter1.Interfaces.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("NO QUACK");
    }
}
