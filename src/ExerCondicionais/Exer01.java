package ExerCondicionais;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro numero: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			maior= num1;
		}else if(num2 > num1 && num2 > num3) {
			maior= num2;
		}else {
			maior= num3;
		}
		
		System.out.println("O maior numero é: " +maior);
		
		ler.close();

	}

}