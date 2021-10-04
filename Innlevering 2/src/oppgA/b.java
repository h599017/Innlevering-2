package oppgA;

public class b {

	public static void main(String[] args) {
		
		int[] ht = {5,6,7};
		
		System.out.print(tilstreng(ht));
	}

	public static String tilstreng(int[] tabell) {
		
		String output = "[";
		
		for(int i = 0; i < tabell.length; i++) {
				if(i < tabell.length - 1) {
					output = output + tabell[i] + ",";
				} else {
					output = output + tabell[i];
				}
			}
		output = output + "]";
		return output;
		}
		

}