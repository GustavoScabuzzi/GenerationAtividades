package ExerPOO;

public class Exer04_TesteFuncionario {

//4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente 
//as informações deste objeto no console.
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
