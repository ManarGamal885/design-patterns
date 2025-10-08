package Chapter10.Test;

import Chapter10.StateMachines.GumballMachine;
import Chapter10.StateMachines.GumballMachine1;

public class StatePattern {
    public static void main(String[] args) {
//        GumballMachine gumballMachine = new GumballMachine(10);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();

        GumballMachine1 gumballMachine1 = new GumballMachine1(10);
        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();

        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        gumballMachine1.refill(4);

        System.out.println(gumballMachine1);


    }
}
