package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
//3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
		
		Scanner ler = new Scanner(System.in);
		
		int idade=0, maior50 = 0, menor21 = 0;
		
		while(idade != -99) {
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			
			if(idade >= 0 && idade < 21) {
				menor21++;
			}else if(idade == -99) {
				// ----------
			}else if(idade > 50){
				maior50++;
			}else if(idade < 0) {
				System.out.print("Idade invalida: ");
			}else {
				System.out.println("Idade " +idade+ " está entre 21 e 50!");
			}
		}
		
		System.out.println("Pessoas com menos de 21 anos = " +menor21+ "\nPessoas com mais de 50 anos = " +maior50);
		
		ler.close();

	}

}
