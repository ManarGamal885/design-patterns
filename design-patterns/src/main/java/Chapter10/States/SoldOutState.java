package Chapter10.States;

import Chapter10.Interfaces.State;
import Chapter10.StateMachines.GumballMachine1;

public class SoldOutState implements State {

    GumballMachine1 gumballMachine;

    public SoldOutState(GumballMachine1 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill(int count) {
        System.out.println("Refilling the gumball machine with " + count + " gumballs.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
