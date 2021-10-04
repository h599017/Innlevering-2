package oppgA;

public class e {

	public static void main(String[] args) {
		int[] e = {5,10,7};
		System.out.println(posisjonTall(e,9));

	}
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1;
		for (int i = 0;i < tabell.length;i++) {
			if (tabell[i] == tall) {
				posisjon = i;
			}
		}
		return posisjon;
		// kunne returnert posisjon +1 for den faktiske "posisjonen"
	}

}
