package Chapter11.Server;

import Chapter11.Interfaces.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

// THE ABSTRACTION
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public State getState() throws RemoteException;
    public String getLocation() throws RemoteException;
}
