package lecturaFicheroAleatorio2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjercicioLecturaFicheroAleatorio3 {

	// Añade un número a cada letra (a1, b2, c3, d4, e5) y realiza la misma
	// operación anterior. Debe quedar e5 d4 c3 b2 a1.
	
	public static void main(String[] args) {
		
		try {
			File texto = new File("abcdenums.txt");

			RandomAccessFile file;

			file = new RandomAccessFile(texto, "rw");

			// En ASCII el 97 es la a y el 101 la e, así que tendríamos que ir desde la e
			// hasta el 97, la
			// a
			int num = 54;
			for (int i = 101; i >= 97; i--) {
				num--;
				file.writeChar(i);
				file.writeChar(num);
				file.writeChars("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
