package ExerCondicionais;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
	
//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
		
		Scanner ler = new Scanner (System.in);
		
		double num;
		
		System.out.print("Digite o numero: ");
		num = ler.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("Esse numero é par!");
			System.out.println("A sua raiz quadrada é: " + Math.sqrt(num));
		}else {
			System.out.println("Esse numero é impar!");
			System.out.println("O seu quadrado é: " + Math.pow(num, 2.0));
		}

	}

}
