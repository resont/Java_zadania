import java.time.LocalDate;

public class Ksiegowy extends Umyslowy {

	protected Ksiegowy(String imieiNazw, LocalDate dataZatr) {
		super(imieiNazw, dataZatr);
		setStanowisko("Ksiegowy");
	}

}
