package ExerPOO;

public class Exer03_TesteProdEletronico {

	public static void main(String[] args) {

		Exer03_ProdutoEletronico prodEletro = new Exer03_ProdutoEletronico();
		
		prodEletro.setTipo("Geladeira");
		prodEletro.setMarca("Brastemp");
		prodEletro.setFuncao("Gelar");
		prodEletro.setAnoFabri(2021);
		prodEletro.setCor("azul");
		
		System.out.println("Tipo: " +prodEletro.getTipo());
		System.out.println("Funçao: " +prodEletro.getFuncao());
		System.out.println("Marca: " +prodEletro.getMarca());
		System.out.println("AnoFabri: " +prodEletro.getAnoFabri());
		System.out.println("Cor: " +prodEletro.getCor());

	}

}
