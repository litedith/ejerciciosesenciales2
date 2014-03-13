package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;
import java.io.*;


import edu.upc.eetac.dsa.egalmes.ejercicioesenciales2.runnable9_1;

public class ejercicio9 {

	public static void main(String[] args) {
		new Thread (new runnable9_1(4) ,"ID1").start(); //new runnable9_1("ID1", 4));
		new Thread (new runnable9_1(7) ,"ID2").start();
		new Thread (new runnable9_1(8) ,"ID3").start();
		
		
		
	}
}
