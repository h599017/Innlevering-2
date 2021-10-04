package oppgB;

public class b {

	public static void main(String[] args) {
		int[] tab = {1,2,3};
		int[][] matrise = {tab,tab,tab};
		System.out.print(tilStreng(matrise));
	}

	public static String tilStreng(int[][] matrise) {
		String retur = "";
		
		for(int[] tabell : matrise) {
			for(int tall : tabell) {
				retur = retur + tall + " ";
			}
			retur = retur + "\n";
		}
		return retur;
	}

}
