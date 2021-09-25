package ExerMatrizVetor;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
		// programa
		// que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine
		// e
		// imprima a média aritmética dos lançamentos, contabilize e apresente também
		// quantas foram as ocorrências da maior pontuação.

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

		System.out.print("O vetor é: ");

		for (x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " | ");
		}

		System.out.println("\nA soma é: " + soma);
		System.out.println("A quantidade de vezes do maior foi: " + ocorrencias);
		System.out.println("A média é: " + soma / (vetor.length));

		ler.close();

	}

}
