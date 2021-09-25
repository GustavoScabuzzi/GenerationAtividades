package ExerProgSequencial;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
				
				Scanner ler = new Scanner(System.in);
				
				int horas, minutos, segundos;
				
				System.out.println("Digite a duraçao do evento em segundos: ");
				segundos = ler.nextInt();
				
				horas = segundos / 3600;
				minutos = (segundos % 3600) / 60;
				segundos = (segundos % 3600) % 60;
				
				System.out.print("O evento teve: "+
									"\nHoras: " +horas+ "Hrs."+
									"\nMinutos: " +minutos+ "Mins."+
									"\nSegundos: " +segundos+ "Segs.");
				

				ler.close();
	}

}
