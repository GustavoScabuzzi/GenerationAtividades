package ExerPOO;

public class Exer04_TesteFuncionario {

//4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
//em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente 
//as informa��es deste objeto no console.
	public static void main(String[] args) {

		Exer04_Funcionario func = new Exer04_Funcionario();
		
		func.setNome("Joao");
		func.setIdade(45);
		func.setCpf("000.000.000-00");
		func.setTempoEmpresa(14);
		func.setCargo("Chefe");
		
		System.out.println("Nome: " +func.getNome());
		System.out.println("Idade: " +func.getIdade()+ " anos");
		System.out.println("Tempo de empresa: " +func.getTempoEmpresa()+ " anos");
		System.out.println("CPF: "+func.getCpf());
		System.out.println("Cargo: "+func.getCargo());

	}

}
