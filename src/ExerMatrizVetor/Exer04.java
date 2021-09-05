package ExerMatrizVetor;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

//4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.
		
		Scanner ler = new Scanner(System.in);
		
		int n1[][] = new int[3][3];
		int x, y, soma=0, somaDiagonal=0;
		
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				System.out.print("Digite o valor da linha " +(x+1)+ " e coluna " +(y+1)+ ": ");
				n1[x][y] = ler.nextInt();
				soma += n1[x][y];
				
				if(x == y) {
					somaDiagonal += n1[x][y];
				}
			}
			System.out.print("");
		}
		
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				System.out.print(n1[x][y] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("A soma dos numeros da matriz é: " +soma);
		System.out.println("A soma da diagonal é: " +somaDiagonal);

	}

}
