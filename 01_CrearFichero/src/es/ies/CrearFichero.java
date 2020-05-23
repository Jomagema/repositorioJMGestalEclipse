package es.ies;

import java.io.*;
import java.io.Serializable;

public class CrearFichero {

	public static void main(String[] args) {
		File fichero = new File("ficheros/datos.txt");
		FileOutputStream fo = null;
		ObjectOutputStream os = null;
		
		try {
			fo = new FileOutputStream(fichero);
		} catch (FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}
		
		try {
			if(fichero.exists()) {
				os = new MiObjectOutputStream(fo);
			}
			else {
				os = new ObjectOutputStream(fo);
			}
		} catch (IOException ioex) {
			System.out.println(ioex.getMessage());
		}
	}

}
