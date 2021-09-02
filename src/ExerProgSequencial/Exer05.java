package ExerProgSequencial;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		//respectivamente.
				
				Scanner ler = new Scanner(System.in);
				
				double nota1, nota2, nota3, media;
				
				System.out.print("Digite a primeira nota: ");
				nota1 = ler.nextDouble();
				nota1 = nota1 * 2;
				
				System.out.print("Digite a segunda nota: ");
				nota2 = ler.nextDouble();
				nota2 = nota2 * 3;
				
				System.out.print("Digite a terceira nota: ");
				nota3 = ler.nextDouble();
				nota3 = nota3 * 5;
				
				media = (nota1 + nota2 + nota3) / 10;
				
				System.out.println(nota1);
				System.out.println(nota2);
				System.out.println(nota3);
				System.out.println("A media final é de: " +media);
				
				ler.close();

	}

}
