package Chapter7.Birds;

import Chapter7.Interfaces.Adapter.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm a MallardDuck flying");
    }
}
