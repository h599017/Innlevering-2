package oppgA;

public class a {
	
	public static void main(String[] args) {
		
		int[] ht = {5,6,7};
		
		skrivUt(ht);
	}

	public static void skrivUt(int[] tabell) {
		
		for(int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

}
