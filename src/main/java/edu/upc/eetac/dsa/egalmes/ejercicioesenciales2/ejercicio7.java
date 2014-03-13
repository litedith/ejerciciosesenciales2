package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;
import java.io.*;
import edu.upc.eetac.dsa.egalmes.ejercicioesenciales2.Dato;


public class ejercicio7 {
	
	public static void main(String[] args) throws Exception {

		Dato dato1 = new Dato(1, "aaa", 'a');
		Dato dato2 = new Dato(2, "bbb", 'b');
		Dato dato3 = new Dato(3, "ccc", 'c');


		// Guardar bytes en fichero
		try {
			FileOutputStream fileOut =
			         new FileOutputStream("C:\\Users\\david\\Desktop\\ej7.txt");
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(dato1);
			         out.writeObject(dato2);
			         out.writeObject(dato3);
			         out.close();
			         fileOut.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out
				.println("Fichero creado y almacenado, pasamos a recuperar datos");
		// Leer fichero y recuperar Datos
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\david\\Desktop\\ej7.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         Dato d1 = (Dato) in.readObject();
	         d1.mostrar();
	         Dato d2 = (Dato) in.readObject();
	         d2.mostrar();
	         Dato d3 = (Dato) in.readObject();	         
	         d3.mostrar();
	         in.close();
	         fileIn.close();
		}catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
