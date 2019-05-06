import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pracownik> lista = new ArrayList<>();
		
		lista.add(new Pracownik("Jan","Kowalski",3000));
		lista.add(new Pracownik("Wojtek","Fajny",5000));
		lista.add(new Pracownik("Janusz","Korwin-Mikke",99999));
		
		ListP³ac p³ace = new ListP³ac(lista);
		System.out.println(p³ace.SumaP³ac());
		
		
	}

}
