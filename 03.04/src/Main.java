import java.util.Timer;
import java.util.TimerTask;
public class Main {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		Czlowiek[] ludzie = new Czlowiek[3];
		ludzie[0] = new Czlowiek("Wojtek","Fornagiel");
		ludzie[1] = new Czlowiek("Marcin","Prokop");
		ludzie[2] = new Czlowiek("Harry","Portier");
		
		
		
		timer.schedule(new TimerTask() {
			int counter = 0;
		@Override
		public void run() {
			System.out.println(ludzie[counter].getImie() +" "+ ludzie[counter].getNazwisko());
			counter ++;
			if(counter == 3){
				timer.cancel();
			}
		}
		}, 1000, 1000);
			
		
	}

}
