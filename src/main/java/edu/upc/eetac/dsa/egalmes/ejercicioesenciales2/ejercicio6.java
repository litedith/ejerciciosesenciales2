package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;
import java.io.*;



public class ejercicio6 { 
	
	public static void main(String [] arg){
		  File archivo1 = null;
	      FileReader fr1 = null;
	      FileWriter fichero = null;
	      PrintWriter pw = null;
	      BufferedReader br1 = null;
	      FileInputStream in2 = null;
		  BufferedInputStream br2 = null;
	
      try
      {
    	  archivo1 = new File ("C:\\Users\\Edith\\ejercicios_dsa\\registro1.txt");
    	  fr1 = new FileReader(archivo1);
    	  br1 = new BufferedReader(fr1);
    	  String linea = null;
    	  while(br1.ready())
    	  	{	    
    		  linea = br1.readLine();
    		  System.out.println ("numero de caracteres son " + linea.length());
    	  	}
    	     in2  = new FileInputStream ("C:\\Users\\Edith\\ejercicios_dsa\\registro1.txt");
	        
	         
	         
	       
    	    int numerobytes = in2.available();
    	    
	         if (numerobytes < linea.length())
	         {
	        	System.out.println ("Numero de caracteres: " +linea.length()+ " es mayor a el numero de bytes: " + numerobytes);
	         }
	         else
	         {
	        	 System.out.println ("Numero de caracteres: " +linea.length()+ " es menor a el numero de bytes: " + numerobytes);
	         }
      }
      catch (Exception e)
      {
     	e.printStackTrace();
      }
}
}