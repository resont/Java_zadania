import java.util.Date;

public class StringMain {

	public static void main(String[] args) {
//		String[] tab1 = new String[4];
//		tab1[0] = "Anna";
//		tab1[1] = "Zofia";
//		tab1[2] = "Józek";
//		tab1[3] = "Stefan";
//		String[] tab2 = {"ANNA","Marian","Józek","Bo¿ena"};
//		
//		for(int i=0;i<tab1.length;i++){
//			System.out.println(tab1[i].compareTo(tab2[i]));
//		}
//		for(int i=0;i<tab1.length;i++){
//			System.out.println(tab1[i].equalsIgnoreCase(tab2[i]));
//		}
//		
//		String[] paths = new String[3];
//		paths[0] = "c:/Program Files/Coœ tam/plik.pdf";
//		paths[1] = "c:/Program Files/test/plik2.pdf";
//		paths[2] = "c:/Program Files/elo/plik.txt";
//		
//		for(int i=0;i<paths.length;i++){
//			int x = paths[i].lastIndexOf('/');
//			System.out.println(paths[i].substring(x+1));
//		}
//		
		StringBuilder sb = new StringBuilder();
		sb.append("Moje urodziny s¹ ");
		sb.append(17);
		sb.append("-go wrzeœnia//");
		sb.append(true);
		sb.append(new Date());
		
		System.out.println(sb.toString());

	}

}
