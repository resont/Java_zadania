
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Set<Czlowieczek> ludzie = new HashSet<>();
		ludzie.add(new Czlowieczek("Wiesiek", LocalDate.of(2000, 1, 2)));
		ludzie.add(new Czlowieczek("Czesiek", LocalDate.of(2000, 1, 2)));
		
		
		Set<Czlowieczek> ludzieDwa = new HashSet<>();
		Iterator<Czlowieczek> i = ludzie.iterator();
		while (i.hasNext()) {
			ludzieDwa.add((Czlowieczek)i.next().clone());
		}
		
		ludzie.forEach(System.out::println);
		ludzieDwa.forEach(System.out::println);
		
		
		System.out.println("\nPo zmianie");
		for (Czlowieczek c: ludzie) {
			c.setDate(LocalDate.of(2001, 1, 2));
		}
		
		ludzie.forEach(System.out::println);
		ludzieDwa.forEach(System.out::println);
		
	}

}

class Czlowieczek implements Cloneable {
	private String imie;
	private LocalDate dataUr;
	
	public Czlowieczek(String imie,LocalDate dataUr) {
		super();
		this.imie = imie;
		this.dataUr = dataUr;
		
	}
	
	@Override
	public String toString() {
		return imie+" "+dataUr;
	}
	
	public void setDate(LocalDate data){
		dataUr = data;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(imie,dataUr);
		
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) return false;
		if (this == arg0) return true;
		if (!getClass().equals(arg0.getClass())) return false;
		
//		Czlowiek o = (Czlowiek)arg0;
		return this.imie.equals(imie) && this.dataUr.equals(dataUr);
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
