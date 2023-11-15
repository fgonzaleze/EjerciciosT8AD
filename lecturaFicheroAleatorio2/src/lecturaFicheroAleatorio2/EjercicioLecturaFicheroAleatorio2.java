package lecturaFicheroAleatorio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjercicioLecturaFicheroAleatorio2 {

	// Aumenta el documento de lectura hasta la letra "e" en líneas diferentes (a,
	// b, c, d, e) y crea un método que las escriba en otro de forma inversa. Sin
	// usar ARRAYS ni BUFFER.

	public static void main(String[] args) {
		try {
			File texto = new File("abcde.txt");

			RandomAccessFile file;

			file = new RandomAccessFile(texto, "rw");

			// En ASCII el 97 es la a y el 101 la e, así que tendríamos que ir desde la e
			// hasta el 97, la
			// a
			for (int i = 101; i >= 97; i--) {

				file.writeChar(i);

				file.writeChars("\n");
				file.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
