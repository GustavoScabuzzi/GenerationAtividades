package ExerProgSequencial;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		//8. O custo de um carro é a soma do custo de fábrica com a percentagem do distribuidor e dos 
		//impostos (aplicados ao custo de fábrica) 
		//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 

				
				Scanner ler = new Scanner(System.in);
				
				double custFabri, custConsu, imposto, distri;
				
				System.out.print("Digite o valor de fabrica: ");
				custFabri = ler.nextDouble();
				
				distri = custFabri * 0.28;
				imposto = custFabri * 0.45;
				custConsu = imposto + custFabri + distri;
				
				
				System.out.println("O custo para o consumidor é de: R$" +custConsu);
				
				ler.close();

	}

}
