package ExerCondicionais;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
	
//4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.
		
		Scanner ler = new Scanner (System.in);
		
		double num;
		
		System.out.print("Digite o numero: ");
		num = ler.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("Esse numero � par!");
			System.out.println("A sua raiz quadrada �: " + Math.sqrt(num));
		}else {
			System.out.println("Esse numero � impar!");
			System.out.println("O seu quadrado �: " + Math.pow(num, 2.0));
		}

	}

}
