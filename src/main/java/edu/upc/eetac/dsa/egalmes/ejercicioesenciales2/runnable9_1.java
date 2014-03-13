package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;
import java.io.*;
public class runnable9_1 implements Runnable{

	//String nombre;
	int numerin;
	//Thread runner;
	
	public runnable9_1(int n) {
		//nombre = n;
		numerin = n;
		//runner.start();
		
	}
	public void run() {
		
		try
		{
		
			while (numerin < 10)
			{
				if (numerin == 0)
				{
					System.out.println ("Fin");
					break;
				}
				
				
		   String nombre = Thread.currentThread().getName();
		   System.out.println (nombre + "Cuenta atrás: " + numerin);
		   numerin --;
		   Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
