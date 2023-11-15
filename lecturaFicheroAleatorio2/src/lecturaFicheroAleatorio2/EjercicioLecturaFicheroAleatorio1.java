package lecturaFicheroAleatorio2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjercicioLecturaFicheroAleatorio1 {

	// Crea un documento de texto con una única letra "a" que será leído de forma
	// aleatoria (seek) y escrito 5 veces en otro documento también de forma
	// aleatoria (seek).

	public static void main(String[] args) {
		try {

			File atexto = new File("a.txt");
			File aaaatexto = new File("aaaa.txt");

			RandomAccessFile filea = new RandomAccessFile(atexto, "rw");
			RandomAccessFile fileaaaa = new RandomAccessFile(aaaatexto, "rw");
			
			filea.seek(0);
			String a = filea.readLine();
			filea.close();
			for (int i = 0; i < 5; i++) {
				fileaaaa.writeChars(a);
				System.out.println("Letra a escrita");
			}
			fileaaaa.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
