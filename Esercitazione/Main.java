package pass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 String pass;
		 System.out.println("Crea la tua password");
		 Scanner t = new Scanner (System.in);
		 pass=t.nextLine();
		 Controllo c= new Controllo(pass);
		 c.generale();
	}

}
