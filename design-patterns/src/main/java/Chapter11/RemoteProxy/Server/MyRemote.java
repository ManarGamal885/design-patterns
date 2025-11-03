package Chapter11.RemoteProxy.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

// The Remote to tell that we are going to use it in a remote calls.
// Any method should throw the RemoteException because it is a remote call.
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
    // Note that the returned String is going to be packed throw the network so we have to ( Serialize - Deserialize ) and it happens in the proxy layer for the Client side
}
