import java.util.ArrayList;
import java.util.List;

public class ListP�ac {

	List<Pracownik> lista = new ArrayList<>();

	public ListP�ac(List<Pracownik> lista) {
		this.lista = lista;
	}
	public int SumaP�ac(){
		int suma = 0;
		for(int i = 0;i<lista.size();i++){
			suma+=lista.listIterator(i).next().getPensja();
			
		}
		return suma;
	}

}
