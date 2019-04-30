import java.time.LocalDate;

public abstract class Czlowiek {
	private LocalDate dataUr;
	private String imieiNazwisko;
	
	protected void setDataUr(LocalDate data){
		dataUr = data;
	}
	protected Czlowiek(String imieiNazwisko){
		this.imieiNazwisko = imieiNazwisko;
	}
}
