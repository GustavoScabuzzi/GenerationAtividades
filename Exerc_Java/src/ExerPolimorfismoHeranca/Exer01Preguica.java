package ExerPolimorfismoHeranca;

public class Exer01Preguica extends Exer01Animal{
	public void sobeArvore() {
		System.out.println("O bixo pregui�a est� subindo uma arvore!");
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a est� emitindo som!");
	}
}
