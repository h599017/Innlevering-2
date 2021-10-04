package oppgA;

public class f {

	public static void main(String[] args) {
		int[] f = {5,10,15,20,25,30};
		int[] ff = reverser(f);
		for(int element : ff) {
			System.out.println(element + " ");
		}
	}
	public static int[] reverser(int[] tabell) {
		int[] revers = new int[tabell.length];
		int x = 0;
		for (int i = tabell.length-1; i>-1;i--) {
			revers[x] = tabell[i];
			x++;
		}
		return revers;
	}

}
