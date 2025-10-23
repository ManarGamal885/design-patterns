package Chapter11;

import Chapter10.StateMachines.GumballMachine1;

public class GumballMonitor {
    public GumballMachine1 machine;

    public GumballMonitor(GumballMachine1 machine){
        this.machine = machine;
    }
    public void report(){
        System.out.println(" Gumball Machine Location : " + machine.getLocation());
        System.out.println(" The number of balls in the Gumball Machine : " + machine.getCount());
        System.out.println(" The state of the Gumball Machine : " + machine.getState());
    }
}
