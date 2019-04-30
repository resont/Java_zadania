import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("test");
		
		List<Pracownik> pracownicy = new ArrayList<>();
		pracownicy.add(new Ksiegowy("Jan Kowalski",LocalDate.of(2010, 12, 1)));
		pracownicy.add(new Programista("Maria W¹sik",LocalDate.of(2014, 12, 1)));
		pracownicy.add(new Magazynier("Zbigniew Nowak",LocalDate.of(2012, 10, 1)));
		pracownicy.add(new OperatorWW("Zofia Klepacka",LocalDate.of(2017, 4, 1)));
		
		for(Pracownik p: pracownicy){
			System.out.println(p.toString());
		}



	}

}
