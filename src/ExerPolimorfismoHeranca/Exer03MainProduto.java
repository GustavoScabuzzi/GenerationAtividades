package ExerPolimorfismoHeranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer03MainProduto {

	public static void main(String[] args) {

		/*
		 * 3 - Crie uma um programa para trabalhar com estoque de uma loja, o programa
		 * deverá trabalhar com Collection do tipo List do Java para manipular os dados
		 * desse estoque, o programa deverá atender as seguintes funcionalidades:
		 * Armazenar dados da List Remover dados da list; Atualizar dados da list.
		 * Apresentar todos os dados da list.
		 */

		ArrayList<Exer03Produto> produto = new ArrayList<Exer03Produto>();
		Scanner ler = new Scanner(System.in);
		int escolha = 0;

		while (escolha != -1) {
			System.out.println("\n-------------------\n" + "1 - Adicionar produtos\n" + "2 - Remover produtos\n"
					+ "3 - Alterar um produto\n" + "4 - Mostrar todos produtos e preços\n"+ "5 - Encerrar sistema\n");

			System.out.println("Digite sua escolha:");
			escolha = ler.nextInt();
			ler.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("\nDigite o nome do produto: ");
				String nome = ler.nextLine();
				System.out.println("\nDigite o preço do produto: ");
				double preco = ler.nextDouble();
				produto.add(new Exer03Produto(nome, preco));

				System.out.println("\nProduto " + nome + " adicionado com sucesso!");
				break;
			case 2:
				System.out.println("\nDigite o nome do produto a remover: ");
				nome = ler.nextLine();
				for (int i = 0; i < produto.size(); i++) {
					if (produto.get(i).getNomeProduto().equals(nome)) {
						produto.remove(i);
						System.out.println("\nO produto " + nome + " foi removido com sucesso!");
					}
				}
				break;
			case 3:
				System.out.println("\nDigite o nome do produto a ser alterado:");
				nome = ler.nextLine();
				for (int i = 0; i < produto.size(); i++) {
					if (produto.get(i).getNomeProduto().equals(nome)) {
						System.out.println("O produto " + nome + " foi encontrado!, digite o novo nome:");
						String novoNome = ler.nextLine();
						System.out.println("Digite o novo preço:");
						preco = ler.nextDouble();
						produto.get(i).setPreco(preco);
						produto.get(i).setNomeProduto(novoNome);
						System.out.println("\nO produto " + nome + " foi alterado com sucesso!");
					}
				}
				break;
			case 4:
				System.out.println("\n----Produtos----\n");
				for (int i = 0; i < produto.size(); i++) {
					System.out.println("Produto | " + produto.get(i).getNomeProduto() + " | preco: R$"
							+ produto.get(i).getPreco());
				}
				break;
			case 5:
				System.out.println("Saindo do sistema!");
				escolha = -1;
				break;
			default:
				System.out.println("Escolha inexistente");
			}
		}
		
		ler.close();

	}

}
