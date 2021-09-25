package ExerMatrizVetor;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um
		// programa
		// que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine
		// e
		// imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		// quantas foram as ocorr�ncias da maior pontua��o.

		Scanner ler = new Scanner(System.in);

		int vetor[] = new int[5];
		int x, soma = 0, ocorrencias = 0, maior = 0;

		System.out.println("Digite valores de 1 a 6: ");

		for (x = 0; x < vetor.length; x++) {
			System.out.print("Digite o " + (x + 1) + "o numero: ");
			vetor[x] = ler.nextInt();

			if (vetor[x] >= maior) {
				if (vetor[x] == maior) {
					ocorrencias++;
				} else {
					ocorrencias = 1;
				}
				maior = vetor[x];
			}

			soma += vetor[x];
		}

		System.out.print("O vetor �: ");

		for (x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " | ");
		}

		System.out.println("\nA soma �: " + soma);
		System.out.println("A quantidade de vezes do maior foi: " + ocorrencias);
		System.out.println("A m�dia �: " + soma / (vetor.length));

		ler.close();

	}

}
