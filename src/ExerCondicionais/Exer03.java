package ExerCondicionais;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
//3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 0 && idade < 10) {
			System.out.println("Voce nao tem idade suficiente!");
		}else if(idade >= 10 && idade <= 14) {
			System.out.println("Voce � da categoria Infantil!");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Voce � da categoria Juvenil!");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("voce � da categoria Adulto!");
		}else if(idade < 0) {
			System.out.println("Idade inv�lida!");
		}else {
			System.out.println("Sua idade � muito avan�ada!");
		}

	}

}
