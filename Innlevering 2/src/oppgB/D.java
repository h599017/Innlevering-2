package oppgB;

public class D {

	public static void main(String[] args) {
		int [] rekke = {1,0,0,1,0};
		int[][] matrise1 = {rekke,rekke,rekke};
		int[][] matrise2 = {rekke,rekke,rekke,rekke};
		System.out.print(erLik(matrise1,matrise2));

	}
	public static boolean erLik(int[][] mat1,int[][] mat2) {
		boolean lik = true;
		
		if(mat1.length == mat2.length) {
			for(int i=0;i<mat1.length;i++) {
				for(int j=0;j<mat1[i].length;j++) {
					if(mat1[i][j] != mat2[i][j]) {
					lik = false;
					}
				}
			}
			for(int i=0;i<mat2.length;i++) {
				for(int j=0;j<mat2[i].length;j++) {
					if(mat1[i][j] != mat2[i][j]) {
						lik = false;
					}
				}
			}
		} else {lik = false;}
		return lik;
	}

}
