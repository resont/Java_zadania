import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args){
		
		class SortowanieMasy implements Comparator<Pojazd>{

			@Override
			public int compare(Pojazd arg0, Pojazd arg1) {
				// TODO Auto-generated method stub
				return Double.compare(arg0.getMasaCalkowita(),arg1.getMasaCalkowita());
			}
			
		}
		
		Pojazd[] pojazdy = new Pojazd[3];
		pojazdy[0] = new Motocykl("Kawasaki",200);
		pojazdy[1] = new Samochód("Subaru",800);
		pojazdy[2] = new Samochód("Skoda",700);
		
		for(Pojazd i: pojazdy) {
			System.out.println(i.getMarka()+" "+i.getMasaCalkowita());
		}
		System.out.println("---");
		Arrays.sort(pojazdy,new SortowanieMasy());
		for(Pojazd i: pojazdy) {
			System.out.println(i.getMarka()+" "+i.getMasaCalkowita());
		}

	}

}
