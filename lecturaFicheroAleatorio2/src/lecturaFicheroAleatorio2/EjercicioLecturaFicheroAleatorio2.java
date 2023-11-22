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
			File texto2 = new File("abcde2.txt");
			RandomAccessFile file;
			RandomAccessFile file2;
			file = new RandomAccessFile(texto, "r");
			file2 = new RandomAccessFile(texto2, "rw");
			
			for(int i= (int) file.length()-1;i>=0;i=i-3) {
				file.seek(i);
				String trozo = file.readLine();
				file2.writeBytes(trozo+"\n");
			}
			file.close();
			file2.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
