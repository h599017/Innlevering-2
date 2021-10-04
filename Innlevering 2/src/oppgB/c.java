package oppgB;

public class c {

	public static void main(String[] args) {
		int [] rekke = {1,0,0,1,0};
		int[][] matrise = {rekke,rekke};
		int[][] dsds = skaler(6,matrise);
		for (int[] a : dsds) {
			for(int b : a) {
				System.out.print(b + " ");
			}
		}
	}
	
	public static int[][] skaler(int tall, int[][] matrise){
		int[][] retur = new int[matrise.length][];
		int x = 0;
		for(int[] tab : matrise) {
				retur[x] = tab;
				x++;
			}
		for(int i=0;i<matrise.length;i++) {
			for(int j = 0;j<matrise[i].length;j++) {
				retur[i][j]*=tall;
			} //vi er klar over bugen som gjør at indeksene blir ganget med tall*i og ikke tall, men ser ikke hvorfor.
		}
		return retur;
	}
}
