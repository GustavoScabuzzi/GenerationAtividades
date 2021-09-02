package ExerProgSequencial;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		//calcule a seguinte expressão:
				
				Scanner ler = new Scanner(System.in);
				
				double a, b, c, d, r, s;
				
				System.out.print("Escreva o valor de A: ");
				a = ler.nextInt();
				
				System.out.print("Escreva o valor de B: ");
				b = ler.nextInt();
				
				System.out.print("Escreva o valor de C: ");
				c = ler.nextInt();
				
				r = Math.pow((a+b), 2.0);
				s = Math.pow((b+c), 2.0);
				
				d = (r + s) / 2;
				
				System.out.println("O valor de R é: " +r);
				System.out.println("O valor de S é: " +s);
				System.out.println("O valor de D é: " +d);
				
				ler.close();

	}

}
