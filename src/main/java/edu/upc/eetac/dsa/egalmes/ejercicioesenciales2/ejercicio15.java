package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;
import java.net.*;
import java.io.*;
public class ejercicio15 {

	public static void main (String [] args) throws IOException
	{
		ServerSocket serversocket= null;
		try
		{ serversocket = new ServerSocket();
		}
		catch (IOException e)
		{
			 System.err.println("Could not listen on port: 10007."); 
	         System.exit(1); 
		}
		  System.out.println ("Waiting for conection.....");
		
		  Socket clientsocket = null;
		
		  for(;;)
		    {
		    	int i = 0;
		    System.out.println ("Waiting for connection.....");

		       try
		           { 
		            clientsocket = serversocket.accept(); 
		           } 
		       catch (IOException e) 
		        	{ 
		    	   System.err.println("Accept failed."); 
		    	   System.exit(1); 
		        	} 

		       System.out.println ("Connection successful");
		       System.out.println ("Waiting for input.....");
		       ejercicio15_1 usuario = new ejercicio15_1 (clientsocket, i);
		       usuario.start();
		      i++;
		 
		      } 
		    
	}
}
