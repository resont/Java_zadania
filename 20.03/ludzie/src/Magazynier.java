import java.time.LocalDate;

public class Magazynier extends Fizyczny {

	protected Magazynier(String imieiNazw, LocalDate dataZatr) {
		super(imieiNazw, dataZatr);
		setStanowisko("Magazynier");
	}

}
