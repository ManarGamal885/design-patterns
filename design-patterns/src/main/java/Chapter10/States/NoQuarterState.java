package Chapter10.States;

import Chapter10.Interfaces.State;
import Chapter10.StateMachines.GumballMachine1;

public class NoQuarterState implements State {

    GumballMachine1 gumballMachine;

    public NoQuarterState(GumballMachine1 gumballMachine) {
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
}
