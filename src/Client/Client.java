package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import Server.Interface;



public class Client {

	private Scanner scanner;
	private Registry registry;
	private Interface ifc; 
	
	public Client(String ip, int port) throws RemoteException, NotBoundException {
		 scanner = new Scanner(System.in);
		 registry = LocateRegistry.getRegistry(ip, port);
		 ifc = (Interface) registry.lookup("rmiTest");
	}
	
	public float sum() throws RemoteException {
	 	System.out.println("Ingresa el número 1: ");
	 	float num1 = 0;
	 	float num2 = 0;
    	try{
    		num1 = Float.parseFloat(scanner.nextLine());
    	}catch(NumberFormatException e){
    		num1 = 0;
    	}

    	System.out.println("Ingresa el número 2: ");
    	try{
    		num2 = Float.parseFloat(scanner.nextLine());
    	}catch(NumberFormatException e){
    		num2 = 0;
    	}
    	
    	return ifc.sumar(num1, num2);
	}
	
}
