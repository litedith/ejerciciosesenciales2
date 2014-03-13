package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;

import java.io.Serializable;
import java.io.*;

public class Dato implements Serializable {
	public String a;
	public int b;
	public char c;
	
	public int getInt() {
		return b;
	}

	public void setInt(int i) {
		this.b = i;
	}

	public String getString() {
		return a;
	}

	public void setString(String s) {
		this.a = s;
	}

	public char getChar() {
		return c;
	}

	public void setChar(char c) {
		this.c = c;
	}

	public void mostrar() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	public Dato(int i, String s, char c) {
		super();
		this.b = i;
		this.a = s;
		this.c = c;
	}

	
}
