package Chapter10.States;

import Chapter10.Interfaces.State;
import Chapter10.StateMachines.GumballMachine1;

public class SoldState implements State {
    GumballMachine1 gumballMachine;

    public SoldState(GumballMachine1 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank so you can't eject the quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot...");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Cannot refill when a gumball is being dispensed");
    }
}
