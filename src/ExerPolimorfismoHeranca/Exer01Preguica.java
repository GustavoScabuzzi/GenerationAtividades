package ExerPolimorfismoHeranca;

public class Exer01Preguica extends Exer01Animal{
	public void sobeArvore() {
		System.out.println("O bixo preguiça está subindo uma arvore!");
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça está emitindo som!");
	}
}
