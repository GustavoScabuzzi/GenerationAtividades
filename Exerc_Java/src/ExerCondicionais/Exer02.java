package ExerCondicionais;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
//2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner ler = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = ler.nextInt();

		if (num1 < num2 && num1 < num3) {
			System.out.print(num1);
			if (num2 < num3) {
				System.out.println(" " + num2 + " " + num3);
			} else {
				System.out.println(" " + num3 + " " + num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			System.out.print(num2);
			if (num1 < num3) {
				System.out.println(" " + num1 + " " + num3);
			} else {
				System.out.println(" " + num3 + " " + num1);
			}
		} else if (num3 < num1 && num3 < num2) {
			System.out.print(num3);
			if (num1 < num2) {
				System.out.println(" " + num1 + " " + num2);
			} else {
				System.out.println(" " + num2 + " " + num1);
			}
		}

		ler.close();

	}
	
}
