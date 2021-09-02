package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
//1-Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

		Scanner ler = new Scanner(System.in);

		int x;
		
		for(x = 1000; x <= 1999; x++) {
			if(x % 11 == 5) {
				System.out.print(x + " ");
			}
		}
		
		ler.close();
	}

}
