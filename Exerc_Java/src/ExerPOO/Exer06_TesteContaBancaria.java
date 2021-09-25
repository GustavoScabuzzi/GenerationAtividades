package ExerPOO;

public class Exer06_TesteContaBancaria {
//6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes 
//esta classe, em seguida crie um objeto conta bancaria, defina as instancias deste 
//objeto e apresente as informações deste objeto no console.
	public static void main(String[] args) {

		Exer06_ContaBancaria contaFisica = new Exer06_ContaBancaria();
		
		contaFisica.setAgencia("250495");
		contaFisica.setConta("222222");
		contaFisica.setDataAbertura("10/10/2020");
		contaFisica.setNomeProprietario("Junior");
		contaFisica.setValor(50000.0);
		
		System.out.println("Agencia: "+contaFisica.getAgencia());
		System.out.println("Conta: "+contaFisica.getConta());
		System.out.println("Data de Abertura: "+contaFisica.getDataAbertura());
		System.out.println("Nome do proprietario: "+contaFisica.getNomeProprietario());
		System.out.println("Valor em conta: R$"+contaFisica.getValor());
	}

}
