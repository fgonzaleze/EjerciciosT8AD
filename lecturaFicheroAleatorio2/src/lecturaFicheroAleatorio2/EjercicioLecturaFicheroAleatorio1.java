package lecturaFicheroAleatorio2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjercicioLecturaFicheroAleatorio1 {

	// Crea un documento de texto con una única letra "a" que será leído de forma
	// aleatoria (seek) y escrito 5 veces en otro documento también de forma
	// aleatoria (seek).

	public static void main(String[] args) {
		// Try ya que vamos a manejar archivos y pueden ocurrir errores
		try {
			// Para el texto que vamos a leer
			File atexto = new File("a.txt");
			// Para el texto que vamos a escribir
			File aaaatexto = new File("aaaa.txt");
			
			// Para acceder al texto con RandomAcess con el modo r, solo de lectura
			RandomAccessFile filea = new RandomAccessFile(atexto, "r");
			// Para acceder al texto con RandomAcess con el modo rw, lectura y escritura
			RandomAccessFile fileaaaa = new RandomAccessFile(aaaatexto, "rw");
			
			// Usamos seek en la posición que queremos leer, en este caso la primera
			filea.seek(0);
			// Metemos en un string la linea que sacamos del archivo
			String a = filea.readLine();
			// Cerramos el archivo 
			filea.close();
			// Bucle for que iterará las veces que queramos que se escriba la letra
			for (int i = 0; i < 5; i++) {
				fileaaaa.writeChars(a);
				// Print para tener un seguimiento de las veces que se ha impreso
				System.out.println("Letra a escrita");
			}
			// Cerramos el archivo que acabmos de escribir cuando acabe el bucle
			fileaaaa.close();
		// Catch para atrapar las excepciones
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error!");
		}
	}

}
