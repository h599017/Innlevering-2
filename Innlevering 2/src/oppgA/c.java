package oppgA;

public class c {

	public static void main(String[] args) {
		
		int[] c = {5,10,7};
		System.out.println("med for-løkke: " + summer1(c));
		System.out.println("med while-løkke: " + summer2(c));
		System.out.println("med utvidet for-løkke: " + summer3(c));

	}
	
	public static int summer1 (int[] tabell) {
		int svar = 0;
		for(int i = 0; i < tabell.length;i++) {
			svar += tabell[i];
		}
		return svar;
	}
	
	public static int summer2 (int[] tabell) {
		int svar = 0;
		int i = -1;
		while (i < tabell.length -1) {
			i++;
			svar += tabell[i];
		}
		return svar;
	}
	
	public static int summer3 (int[] tabell) {
		int svar = 0;
		for (int element : tabell) {
			svar += element;
		}
		return svar;
	}

}
