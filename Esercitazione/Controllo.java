package pass;

public class Controllo extends Thread {
	String pass1;
	public Controllo(String pass1) {
		this.pass1= pass1;
	}
	
	public boolean lunghezza() {
		if(pass1.length()<7) {
			return false;
		 }
		return true;
	}
	
	public boolean spazio() {
		if(pass1.indexOf(" ")==-1) {
			 return true;
		 }else{
			 return false;
		 }
	}
	
	public boolean numero() {
		for (int i = 0; i < pass1.length(); i++) {
	        if (Character.isDigit(pass1.charAt(i))) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public boolean lettera(char c) {
		char carattere;
        boolean max= false;
        for(int i=0;i<26;i++) {
        	carattere = (char) (c+i);
            if(pass1.indexOf(carattere)!=-1) {
                max=true;
            }
            }
        if(max==true) {
            return true;
        }
        else {
            return false;
        }
	}
	
	public void generale() {
		if(lettera('a') && lettera('A') && numero() && spazio() && lunghezza()== true) {
			System.out.println("La password rispette tutte le indicazioni richieste.");
		}else {
			System.out.println("La password NON rispette tutte le indicazioni richieste.");
		}
	}
}