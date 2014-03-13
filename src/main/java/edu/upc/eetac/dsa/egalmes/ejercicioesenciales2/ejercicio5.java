package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio5 {
	 public static void main(String [] arg)  {
		 FileInputStream in = null;
	     FileOutputStream out = null;
	     BufferedInputStream br = null;
	 
         try{
 			
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         in  = new FileInputStream ("C:\\Users\\Edith\\ejercicios_dsa\\carrito.jpg");
	         br = new  BufferedInputStream(in);
	         out = new FileOutputStream ("C:\\Users\\Edith\\ejercicios_dsa\\registro1.txt" , true);
	         byte [] buf = new byte[100000];
	         
	         int len = 0;
	         
	         while ((len = br.read(buf)) > 0)
	         {
	        	//br.available();
	        	 System.out.println (len);
	        	 //out.write(len);
	        	 String s = " numero de bytes son " + len + ".";
	        	 byte [] barr = s.getBytes();
	        	 out.write(barr);
	         }
	  
	         
	         
	        
	          
	         
	         
	        //System.out.println (br.read(buf));
	         in.close();
	         out.close();
	 
         }
         catch (Exception e)
         {
        	e.printStackTrace();
         }
}}