package ExerProgSequencial;

import java.util.Scanner;

public class Exer01 {
	
	public static void main(String[] args) {
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//dias e mostre-a expressa apenas em dias.		
			
			Scanner ler = new Scanner(System.in);
			
			int anos, meses, dias, idadeDias;
			
			System.out.print("Digite sua idade em anos, meses e dias! \nAnos: " );
			anos = ler.nextInt();
			
			System.out.print("Meses: ");
			meses = ler.nextInt();
				
			System.out.print("Dias: ");
			dias = ler.nextInt();
			
			idadeDias = (anos*365) + (meses*30) + dias;
			System.out.print("A sua idade em quantidade de dias é igual a: " +idadeDias+ " dias");
			
			ler.close();
	}
}
