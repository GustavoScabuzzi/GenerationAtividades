package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
//6 - Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. 
//Para sair digitar 0(zero).(DO...WHILE)
		
		Scanner ler = new Scanner(System.in);
		
		double num=0.0, cont=0, soma=0;
		
		do {
			System.out.print("Digite o numero: ");
			num = ler.nextDouble();
			
			if(num % 3 == 0 && num != 0) {
				soma += num;
				cont++;				
			}
			
		}while(num != 0);
		
		System.out.println("A media dos numeros é de: " + soma / cont);
		
		ler.close();
		
	}

}
