package Chapter11.Client;

import Chapter11.Server.GumballMachineRemote;

import java.rmi.RemoteException;

// The getLocation, getCount and getState will get their implementation from the Stub
public class GumballMonitor {
    public GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try {
            System.out.println(" Gumball Machine Location : " + machine.getLocation());
            System.out.println(" The number of balls in the Gumball Machine : " + machine.getCount());
            System.out.println(" The state of the Gumball Machine : " + machine.getState());
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
