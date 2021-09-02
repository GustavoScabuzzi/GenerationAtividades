package ExerProgSequencial;

import java.util.Scanner;

public class Exer07 {
	
	public static void main(String[] args) {
		//7. Um sistema de equações lineares do tipo: 
		//, pode ser resolvido segundo mostrado abaixo :  
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
				
				Scanner ler = new Scanner(System.in);
				
				double a, b, c, d, e, f, x, y;
				
				System.out.print("digite o valor de A: ");
				a = ler.nextDouble();
				System.out.print("digite o valor de B: ");
				b = ler.nextDouble();
				System.out.print("digite o valor de C: ");
				c = ler.nextDouble();
				System.out.print("digite o valor de D: ");
				d = ler.nextDouble();
				System.out.print("digite o valor de E: ");
				e = ler.nextDouble();
				System.out.print("digite o valor de F: ");
				f = ler.nextDouble();
				
				x = (c*e - b*f) / (a*e - b*d);
				y = (a*f - c*d) / (a*e - b*d);
				
				System.out.println("O valor de X é: " +x);
				System.out.println("O valor de Y é: " +y);

				
				ler.close();

	}

}
