package Chapter11.States;

import Chapter11.Interfaces.State;
import Chapter11.Server.GumballMachine;

import java.rmi.RemoteException;
import java.util.Random;

public class HasQuarterState implements State {
    private static final long serialVersionUID = 2L;

    // Using the transient means ignore the GumballMachine1 when you want to serialize this class
    transient GumballMachine gumballMachine;

    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank(){
        try {
            System.out.println("You turned...");
            int winner = randomWinner.nextInt(10);
            if ((winner == 0) && (gumballMachine.getCount() > 1)) {
                gumballMachine.setState(gumballMachine.getWinnerState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldState());
            }
        }catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill(int count) {
        System.out.println("Cannot refill when there is a quarter in the machine");
    }

    @Override
    public String toString() {
        return "Has a Quarter State";
    }

}
