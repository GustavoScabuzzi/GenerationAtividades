package ExerPolimorfismoHeranca;

public class Exer03Produto {
	private String nomeProduto = "";
	private double preco = 0.0;
	
	public Exer03Produto(String nomeProduto, double preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
