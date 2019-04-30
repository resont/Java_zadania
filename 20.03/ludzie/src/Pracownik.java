import java.time.LocalDate;

public abstract class Pracownik extends Czlowiek {
	private LocalDate dataZatr;
	private String stanowsiko;
	protected Pracownik(String imieiNazw, LocalDate dataZatr) {
		super(imieiNazw);
		this.dataZatr = dataZatr;
	}
	
	protected void setStanowisko(String stanowisko){
		this.stanowsiko = stanowisko;
	}
	
}
