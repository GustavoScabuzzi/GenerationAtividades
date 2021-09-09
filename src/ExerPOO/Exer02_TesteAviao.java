package ExerPOO;

public class Exer02_TesteAviao {

//2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto avião, defina as instancias deste objeto e apresente as 
//informações deste objeto no console.
	
	public static void main(String[] args) {
		
		Exer02_Aviao jato = new Exer02_Aviao();
		
		jato.setAno(2020);
		jato.setCapPassageiros(10);
		jato.setModelo("Militar");
		jato.setVelocidade(1500);
		
		System.out.println("Ano: " +jato.getAno());
		System.out.println("Cap. Passageiros: " +jato.getCapPassageiros());
		System.out.println("Modelo: " +jato.getModelo());
		System.out.println("Velocidade: " +jato.getVelocidade()+ "km/h");

	}

}
