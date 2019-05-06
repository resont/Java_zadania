package kolos1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File we = new File("B.dat");
		Scanner sc = new Scanner(we);
		int suma = 0;
		while(sc.hasNextLine()){
			String linia = sc.nextLine();
			if(linia.contains("!")){
				suma += 1;
			}
		}
		System.out.println(suma);

	}

}
