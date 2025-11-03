package Chapter11.RemoteProxy.Client;

import Chapter11.RemoteProxy.Server.MyRemote;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String hello = service.sayHello();
            System.out.println("Client received: " + hello);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
