package Chapter11.States;

import Chapter11.Interfaces.State;
import Chapter11.Server.GumballMachine;

public class SoldOutState implements State {

    private static final long serialVersionUID = 2L;

    // Using the transient means ignore the GumballMachine1 when you want to serialize this class
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
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

    @Override
    public String toString() {
        return "SoldOut State";
    }

}
