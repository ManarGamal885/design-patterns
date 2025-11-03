package Chapter11.States;

import Chapter11.Interfaces.State;
import Chapter11.Server.GumballMachine;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;

    // Using the transient means ignore the GumballMachine1 when you want to serialize this class
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill(int count) {
        System.out.println("Cannot refill when there is no quarter in the machine");
    }

    @Override
    public String toString() {
        return "No Quarter State";
    }

}
