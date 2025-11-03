package Chapter11.Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// REGISTER THE SERVICE INTO THE RMI
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote;
        int count  = 10;

        try {
            // Start registry programmatically on port 1099.
            LocateRegistry.createRegistry(1099);
            gumballMachineRemote = new GumballMachine("EGYPT", count);

            // Register the service into the RMI Registry.
            Naming.rebind("GumballMachine", gumballMachineRemote);
            System.out.println("✅ Server ready");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
