package ExerProgSequencial;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.
				
				Scanner ler = new Scanner(System.in);
				
				int anos, meses, dias, idadeDias;
				
				System.out.print("Digite a idade em dias: ");
				idadeDias = ler.nextInt();
				
				anos = idadeDias / 365;
				meses = (idadeDias % 365) / 30;
				dias = (idadeDias % 365) % 30;
				
				System.out.println("Sua idade é: " +anos+ " anos, " +meses+ " meses, " +dias+ " dias");
				
				ler.close();
				
	}

}
