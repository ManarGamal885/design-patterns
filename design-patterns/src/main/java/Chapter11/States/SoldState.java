package Chapter11.States;

import Chapter11.Interfaces.State;
import Chapter11.Server.GumballMachine;

import java.rmi.RemoteException;

public class SoldState implements State {
    private static final long serialVersionUID = 2L;

    // Using the transient means ignore the GumballMachine1 when you want to serialize this class
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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
    public void dispense(){
        try {
            System.out.println("A gumball comes rolling out the slot...");
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Cannot refill when a gumball is being dispensed");
    }

    @Override
    public String toString() {
        return "Sold State";
    }

}
