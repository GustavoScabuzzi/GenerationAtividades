package ExerMatrizVetor;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

//1 - Fa�a um programa que crie um vetor por leitura com 5 valores                   de pontua��o de uma atividade e o 
//usar um for - escreva em seguida. 
//Encontre ap�s a maior pontua��o e a apresente. 
//Mostre a posicao do maior valor
		
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int cont, maior=0, posiMaior=0;
		
		System.out.println("Preencha o vetor");
		
		for (cont = 0; cont < 5; cont++) {      // RODAR AS POSI�OES DO VETOR
			System.out.print("Digite o " +(cont+1)+ "o valor: ");
			
			vetor[cont] = ler.nextInt();		// INSERIR A INFORMA�AO DIGITADO NA POSICAO ATUAL DO LA�O
		}
		
		System.out.println("\nO vetor �: ");
		
		for (cont = 0; cont < 5; cont++) {		// imprimir o nosso vetor
			System.out.print(vetor[cont] + " |");
			
			if(vetor[cont] > maior) {			// O nosso vetor na posicao Cont � maior que o nosso maior valor?
				maior = vetor[cont];
				posiMaior = cont+1;
			}
			
		}
		
		System.out.println("\nO maior valor �: " + maior);
		System.out.println("A posicao do maior valor �: " + posiMaior);
		
		
		

	}

}
