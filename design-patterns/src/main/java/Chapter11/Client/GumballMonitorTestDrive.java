package Chapter11.Client;

import Chapter11.Server.GumballMachineRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;

// Get the Stub from the service
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        // We can have multiple places but lest go with Egypt and Palestine.
        // Initializing the monitor that needs this service
        GumballMonitor monitor = null;
        // Looking up for the service with location Egypt through the RMI Registry.
        try {
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/GumballMachine");
            monitor = new GumballMonitor(machine);
            System.out.println("MONITOR: " + monitor);
        }catch (Exception e){
            e.printStackTrace();
        }

        // Testing the monitor
        if (monitor != null) {
            monitor.report();
        } else {
            System.out.println("Monitor could not be created — service lookup failed.");
        }
    }
}
