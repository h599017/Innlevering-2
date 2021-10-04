package oppgA;

public class d {

	public static void main(String[] args) {
		int[] d = {5,10,7};
		if(finnesTall(d, 9)) {
			System.out.println("ja!");
		} else {
			System.out.println("nei.");
		}

	}
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean state = false;
		for(int element : tabell) {
			if (element == tall) {
				state = true;
			}
		}
		return state;
	}
}
