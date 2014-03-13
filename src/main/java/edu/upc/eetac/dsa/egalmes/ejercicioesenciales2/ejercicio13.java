package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;
import edu.upc.eetac.dsa.egalmes.ejercicioesenciales2.*;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import edu.upc.eetac.dsa.egalmes.ejercicioesenciales2.ejercicio13_1;
public class ejercicio13

{

	public static void main(String[] args) throws IOException 
	   { 
			ServerSocket serverSocket = null; 
			Socket clientSocket = null;

	    try { 
	         serverSocket = new ServerSocket(10007); 
	        } 
	    catch (IOException e) 
	        { 
	         System.err.println("Could not listen on port: 10007."); 
	         System.exit(1); 
	        } 

	   
	    for(;;)
	    {
	    	int i = 0;
	    System.out.println ("Waiting for connection.....");

	       try
	           { 
	            clientSocket = serverSocket.accept(); 
	           } 
	       catch (IOException e) 
	        	{ 
	    	   System.err.println("Accept failed."); 
	    	   System.exit(1); 
	        	} 

	       System.out.println ("Connection successful");
	       System.out.println ("Waiting for input.....");
	       ejercicio13_1 usuario = new ejercicio13_1 (clientSocket, i);
	       usuario.start();
	      i++;
	 
	      } 
	    
	   
	   }
	
}

