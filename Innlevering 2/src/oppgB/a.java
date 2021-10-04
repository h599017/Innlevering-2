package oppgB;

public class a {

	public static void main(String[] args) {
		int [] rekke = {1,0,0,1,0};
		int[][] matrise = {rekke,rekke,rekke};
		skrivUtv1(matrise);
	}
	
	public static void skrivUtv1(int[][] matrise) {
		for(int[] tabell : matrise) {
			for (int tall : tabell) {
				System.out.print(tall + " ");
			}
		System.out.println();
		}
	}

}
