package Chapter11.Interfaces;

import java.io.Serializable;
import java.rmi.RemoteException;

// Extends the serializable because the state is going to be transferred through the network
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void dispense();
    public void turnCrank();
    public void refill(int count);

}
