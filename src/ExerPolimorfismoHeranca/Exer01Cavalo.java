package ExerPolimorfismoHeranca;

public class Exer01Cavalo extends Exer01Animal{
	public void cavaloCorre() {
		System.out.println("O cavalo est� correndo!");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo est� emitindo som!");
	}
}
