package ExerProgSequencial;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		//6. Construa um programa em c que, tendo como dados de entrada dois pontos
		//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
		//que efetua tal cálculo é:
				
				Scanner ler = new Scanner(System.in);
				
				double x1, x2, y1, y2, d;
				
				System.out.print("Digite o valor de x1: ");
				x1 = ler.nextDouble();
				System.out.print("Digite o valor de x2: ");
				x2 = ler.nextDouble();
				System.out.print("Digite o valor de y1: ");
				y1 = ler.nextDouble();
				System.out.print("Digite o valor de y2: ");
				y2 = ler.nextDouble();
				
				d = Math.pow((x2-x1), 2.0) + Math.pow((y2 - y1), 2.0);
				d = Math.sqrt(d);
				
				System.out.println("O resultado da funcao é: " +d);
				
				ler.close();

	}

}
