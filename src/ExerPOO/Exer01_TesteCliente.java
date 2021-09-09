package ExerPOO;

public class Exer01_TesteCliente {

//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
//informações deste objeto no console.
	
	public static void main(String[] args) {

		Exer01_Cliente cliente1 = new Exer01_Cliente();
		
		cliente1.setNome("Gustavo");
		cliente1.setEmail("gustavo-gsg@hotmail.com");
		cliente1.setEndereço("Rua blabla");
		cliente1.setIdade(24);
		cliente1.setCpf("000.000.000-00");
		
		System.out.println();
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getEmail());
		System.out.println(cliente1.getEndereço());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getCpf());
		
		
	}

}
