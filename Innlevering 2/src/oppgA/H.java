package oppgA;

public class H {

	public static void main(String[] args) {
		int[] en = {1,2,3};
		int[] to = {4,5,6};
		int[] komb = settSammen(en,to);
		for (int e : komb) {
			System.out.print(e + " ");
		}

	}
	
	public static int[] settSammen(int[] tabell, int[] tabell2) {
		int [] comb = new int[tabell.length + tabell2.length];
		for(int i = 0; i<tabell.length;i++) {
			comb[i] = tabell[i];
		}
		for(int i = tabell.length;i<tabell.length+tabell2.length;i++) {
			comb[i] = tabell2[i-tabell.length];
		}
		return comb;
	}

}
