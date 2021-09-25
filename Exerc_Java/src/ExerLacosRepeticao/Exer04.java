package ExerLacosRepeticao;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
//4 - Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a 
//cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//o número de pessoas calmas; 
//o número de mulheres nervosas; 
//o número de homens agressivos; 
//o número de outros calmos;
//o número de pessoas nervosas com mais de 40 anos; 
//o número de pessoas calmas com menos de 18 anos

		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, humor, cont=1;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosaMais40=0, calmasMenos18=0;
		
		while(cont <= 10) {
			System.out.print("Digite a idade da " +cont+ "a pessoa: ");
			idade = ler.nextInt();
			System.out.print("Digite o sexo da " +cont+ "a pessoa: ");
			sexo = ler.nextInt();
			System.out.print("Digite o humor da " +cont+ "a pessoa: ");
			humor = ler.nextInt();
			
			if(humor == 1) {			// VERIFICAR PESSOAS CALMAS
				pessoasCalmas++;
				if(idade < 18) {
					calmasMenos18++;
				}
				if(sexo == 3) {			// VERIFICAR PESSOAS OUTROS CALMOS
					outrosCalmos++;
				}
			}else if(humor == 2) {		// VERIFICAR PESSOAS NERVOSAS
				if(idade > 40) {		// VERIFICAR NERVOSAS MAIORES DE 40 ANOS
					nervosaMais40++;
				}
				if(sexo == 1) {			// VERIFICAR MULHERES NERVOSAS
					mulheresNervosas++;
				}
			}else if(humor == 3) {		// VERIFICAR PESSOAS AGRESSIVAS
				if(sexo == 2) {			// VERIFICAR HOMENS AGRESSIVOS
					homensAgressivos++;
				}
				
			}
			
			System.out.println("");
			cont++;
		}
		
		System.out.println("Pessoas calmas: " +pessoasCalmas);
		System.out.println("Mulheres nervosas: " +mulheresNervosas);
		System.out.println("Homens agressivos: " +homensAgressivos);
		System.out.println("Outros calmos: " +outrosCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: " +nervosaMais40);
		System.out.println("Pessoas calmas com menos de 18 anos: " +calmasMenos18);
		
		ler.close();
		
	}

}









