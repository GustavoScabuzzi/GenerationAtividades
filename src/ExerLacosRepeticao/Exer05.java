package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0;
		
		do {
			System.out.println("Digite o numero: ");
			num = ler.nextInt();
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos numeros digitados �: " +soma);
		
		ler.close();

	}

}
