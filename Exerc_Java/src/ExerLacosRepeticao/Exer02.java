package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
//2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
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
