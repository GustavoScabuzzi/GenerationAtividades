package ExerPOO;

public class Exer07_TestePaciente {
//7) Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe, 
//em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as 
//informa��es deste objeto no console.
	public static void main(String[] args) {

		Exer07_Paciente paciente = new Exer07_Paciente();
		
		paciente.setNome("Douglas");
		paciente.setIdade(50);
		paciente.setNacionalidade("Argentino");
		paciente.setQuantFilhos(3);
		paciente.setDoen�a("Cancer");
		
		System.out.println("Nome: " +paciente.getNome());
		System.out.println("Idade: "+paciente.getIdade());
		System.out.println("Doen�a: "+paciente.getDoen�a());
		System.out.println("Nacionalidade: "+paciente.getNacionalidade());
		System.out.println("Quantidade de Filhos: "+paciente.getQuantFilhos());
		
		
	}

}
