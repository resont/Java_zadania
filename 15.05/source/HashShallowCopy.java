package source;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashShallowCopy {

	public static void main(String[] args) {
		Set<Czlowiek> ludzie = new HashSet<>();
		ludzie.add(new Czlowiek("Wiesiek", LocalDate.of(2000, 1, 2)));
		ludzie.add(new Czlowiek("Czesiek", LocalDate.of(2000, 1, 2)));
		
		ludzie.forEach(System.out::println);
		
		Set<Czlowiek> ludzieDwa = new HashSet<>(ludzie);
		ludzieDwa.forEach(System.out::println);
		
		for (Czlowiek c: ludzie) {
			c.setDate(LocalDate.of(2001, 1, 2));
		}
		
		ludzie.forEach(System.out::println);
		ludzieDwa.forEach(System.out::println);
	}

}

class Czlowiek {
	private String imie;
	private LocalDate dataUr;
	
	public Czlowiek(String imie,LocalDate dataUr) {
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

}
