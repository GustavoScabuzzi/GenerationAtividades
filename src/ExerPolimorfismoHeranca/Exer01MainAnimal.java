package ExerPolimorfismoHeranca;

public class Exer01MainAnimal {
/*
	 * 01 - Crie uma hierarquia de classes conforme abaixo com os seguintes
	 * atributos e comportamentos (observe a tabela), utilize os seus conhecimentos
	 * e distribua as caracter�sticas de forma que tudo o que for comum a todos os
	 * animais fique na classe Animal:
	 * 
	 * 
	 * 02 - Implemente um programa que crie os 3 tipos de animais definidos no
	 * exerc�cio anterior e invoque o m�todo que emite o som de cada um de forma
	 * polim�rfica, isto �, independente do tipo de animal.
	 */
	public static void main(String[] args) {

		Exer01Cachorro cachorro = new Exer01Cachorro();
		Exer01Cavalo cavalo = new Exer01Cavalo();
		Exer01Preguica preguica = new Exer01Preguica();
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		

	}

}
