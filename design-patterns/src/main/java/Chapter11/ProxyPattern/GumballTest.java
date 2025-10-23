package Chapter11.ProxyPattern;

import Chapter10.StateMachines.GumballMachine1;
import Chapter11.GumballMonitor;

public class GumballTest {
    public static void main(String[] args) {
        // Using the args of the main as input to the gumball monitor.
        // Note that u can use normal inputs.
        args = new String[] {"Seattle", "2"};

        int count = 0;

        count = Integer.parseInt(args[1]);
        GumballMachine1 gumballMachine = new GumballMachine1(args[0], count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }

}
