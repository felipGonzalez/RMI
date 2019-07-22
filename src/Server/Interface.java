package Server;

import java.awt.image.BufferedImage;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote{

	float sumar(float numero1, float numero2) throws RemoteException;
	public void copyImage(String filePath, String copyPath, int MAX_WIDTH, int MAX_HEIGHT) throws RemoteException;
	public BufferedImage loadImage(String pathName) throws RemoteException;
	public void saveImage(BufferedImage bufferedImage, String pathName) throws RemoteException;
	public BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) throws RemoteException;
	
}
