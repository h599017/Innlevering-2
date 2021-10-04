package oppgA;

public class g {

	public static void main(String[] args) {
		int[] sortert = {5,7,7,8};
		System.out.print(erSortert(sortert));

	}
	
	public static boolean erSortert(int[] tabell) {
		boolean retur = true;
		for(int i=1; i<tabell.length;i++) {
			if(tabell[i]<tabell[i-1]) {
				retur = false;
			}
		}
		return retur;
	}

}
