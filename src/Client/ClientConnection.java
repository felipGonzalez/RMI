package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientConnection {
	
	public static void main(String[] args) {
		Client client;
		try {
			client = new Client("localhost", 1100);
			System.out.println(client.sum());
			
		} catch (RemoteException | NotBoundException e) {
			System.out.println("No hay conexion");
			System.err.println(e.getMessage());
		}
		
		}

}
