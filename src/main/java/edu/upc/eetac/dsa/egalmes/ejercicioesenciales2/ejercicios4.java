package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;

import java.io.*;
import java.util.*;
import java.text.*;


public class ejercicios4 {
	 public static void main(String [] arg)  {
	      File archivo = null;
	      FileReader fr = null;
	      FileWriter fichero = null;
	      PrintWriter pw = null;
	      BufferedReader br = null;
	 
         try{
        	//Sacamos la fecha
 			Date fecha = new Date();
 			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY  HH: mm: ss");
 			String fechastring = formato.format(fecha);
 			System.out.println(fechastring);
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\registro.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         String linea = null;
	         
	        
	         while(br.ready())
	       //  while ((linea = br.readLine()) != null)
	         	{
	        	
	        	 linea=br.readLine();
	        	 System.out.println ("numero de caracteres son " + linea.length() + "." );
	        	 }
	        	
            
	         fichero = new FileWriter("C:\\Users\\Edith\\ejercicios_dsa\\registro1.txt");
	         pw = new PrintWriter(fichero);
	         pw.write("numero de caracteres: "+ linea.length() + " Registro: " +fechastring);
	         pw.close();
	         	}
         catch (Exception e)
         {
        	e.printStackTrace();
         }
}}