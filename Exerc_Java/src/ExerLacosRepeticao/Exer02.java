package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
//2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner ler = new Scanner(System.in);
		
		int x, par = 0, impar = 0, num;
		
		for(x = 1; x <= 10; x++) {
			System.out.print("Digite o " +x+ "o numero: ");
			num = ler.nextInt();
			
			if(num % 2 == 0) {
					par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Pares: " +par+ "\nImpar: " +impar);

		ler.close();
	}

}
