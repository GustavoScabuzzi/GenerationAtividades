package ExerProgSequencial;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		//8. O custo de um carro � a soma do custo de f�brica com a percentagem do distribuidor e dos 
		//impostos (aplicados ao custo de f�brica) 
		//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 

				
				Scanner ler = new Scanner(System.in);
				
				double custFabri, custConsu, imposto, distri;
				
				System.out.print("Digite o valor de fabrica: ");
				custFabri = ler.nextDouble();
				
				distri = custFabri * 0.28;
				imposto = custFabri * 0.45;
				custConsu = imposto + custFabri + distri;
				
				
				System.out.println("O custo para o consumidor � de: R$" +custConsu);
				
				ler.close();

	}

}
