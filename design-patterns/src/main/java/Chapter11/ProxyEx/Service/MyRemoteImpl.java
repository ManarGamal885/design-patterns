package Chapter11.ProxyEx.Service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// UnicastRemoteObject is used to mark this service as a remote service
// Note that class UnicastRemoteObject implements the Serializable class so we need the serialVersionUID.
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return " Server says ,, Hello ";
    }

    // Now we will register the service into the rmi so the client ( proxy can call it from the rmi using this name ).
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
