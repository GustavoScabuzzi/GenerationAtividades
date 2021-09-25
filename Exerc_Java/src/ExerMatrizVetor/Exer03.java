package ExerMatrizVetor;

public class Exer03 {

	public static void main(String[] args) {
		
//3 - Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//posição das matrizes N1 e N2.
		
		int n1[][] = {{10, 20, 30, 40, 50, 60},
					  {70, 80, 90, 11, 12, 13},
					  {14, 15, 16, 17, 18, 20},
					  {35, 25, 45, 50, 25, 65}};
		
		int n2[][] = {{55, 42, 75, 97, 98, 75},
				  	  {72, 16, 26, 55, 92, 43},
				      {35, 91, 85, 64, 56, 42},
				      {21, 58, 94, 34, 89, 41}};
		
		int m1[][] = new int[4][6], m2[][] = new int[4][6]; 
		int x, y;
		
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6 ; y++) {
				
				m1[x][y] = n1[x][y] + n2[x][y];
				m2[x][y] = n1[x][y] - n2[x][y];
			}			
		}
		
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6 ; y++) {
				System.out.print(m1[x][y]+ " | ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6 ; y++) {
				System.out.print(m2[x][y]+ " | ");
			}
			System.out.println("");
		}

	}

}
