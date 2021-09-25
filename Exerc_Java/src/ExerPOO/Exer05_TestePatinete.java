package ExerPOO;

public class Exer05_TestePatinete {
//5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as
//informações deste objeto no console.
	public static void main(String[] args) {

		Exer05_Patinete patineteSimples = new Exer05_Patinete();
		
		patineteSimples.setMarca("Caloi");
		patineteSimples.setMaterial("Aluminio");
		patineteSimples.setTempoDeUso(2);
		patineteSimples.setTipoDeRoda("Silicone");
		patineteSimples.setPesoLimite(50.0);
		
		System.out.println("Marca: " +patineteSimples.getMarca());
		System.out.println("Material: " +patineteSimples.getMaterial());
		System.out.println("Tempo de Uso: " +patineteSimples.getTempoDeUso()+ " anos");
		System.out.println("Tipo de Roda: " +patineteSimples.getTipoDeRoda());
		System.out.println("Peso Limite: " +patineteSimples.getPesoLimite()+ "kgs");
		

	}

}
