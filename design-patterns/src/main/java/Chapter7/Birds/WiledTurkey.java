package Chapter7.Birds;

import Chapter7.Interfaces.Adapter.Turkey;

public class WiledTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm a WiledTurkey flying a short distance");
    }
}
