package ExerPolimorfismoHeranca;

public class Exer01Cachorro extends Exer01Animal{
	public void cachorroCorre() {
		System.out.println("\nO cachorro est� correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro est� latindo");
	}
}
