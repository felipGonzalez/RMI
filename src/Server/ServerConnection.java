package Server;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerConnection {

	public static void main(String[] args) throws AccessException, RemoteException, AlreadyBoundException {
		Server server = new Server();
		Registry registry = LocateRegistry.createRegistry(server.getPort());
       	System.out.println("Servidor escuchando en el puerto " + String.valueOf(server.getPort()));
        registry.bind("rmiTest", server);
	}
	
	
}
