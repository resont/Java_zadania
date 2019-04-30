import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(System.getProperty("user.dir"));
		File plikwe = new File("test.dat");
		Scanner sc = new Scanner(plikwe);
		
		File plikw = new File("test2.dat");
		PrintWriter pw = new PrintWriter(plikw);
		
		while(sc.hasNextLine()){
			String linia = sc.nextLine();
		
			if(linia.contains("ala")){
				pw.println(linia);
				System.out.println(linia);
			}
			
		
		
			
		}
		pw.flush();
		pw.close();
		sc.close();

	}

}
