package Chapter7.Test;

import Chapter7.Adapters.TurkeyAdapter;
import Chapter7.Birds.MallardDuck;
import Chapter7.Birds.WiledTurkey;
import Chapter7.Interfaces.Adapter.Duck;
import Chapter7.Interfaces.Adapter.Turkey;

public class AdapterPattern {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WiledTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


        // TurkeyAdapter adapts a Turkey to behave like a Duck
        System.out.println("-----------------------------Duck-----------------------------");
        duck.fly();
        duck.quack();
        System.out.println("-----------------------------Turkey-----------------------------");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
