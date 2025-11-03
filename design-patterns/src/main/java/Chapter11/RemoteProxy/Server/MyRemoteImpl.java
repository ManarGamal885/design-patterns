package Chapter11.RemoteProxy.Server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

// UnicastRemoteObject is used to mark this service as a remote service
// Note that class UnicastRemoteObject implements the Serializable class so we need the serialVersionUID.
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "Server says: Hello";
    }

    public static void main(String[] args) {
        try {
            // Start registry programmatically on port 1099
            LocateRegistry.createRegistry(1099);
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
            System.out.println("✅ Server ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
