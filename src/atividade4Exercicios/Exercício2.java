package atividade4Exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercício2 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
		 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
		 * Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo livro na pilha.
		 * Deve solicitar o nome do livro. 2: Listar todos os livros da Pilha 3: Retirar
		 * um livro da pilha 0: O programa deve ser finalizado. Caso a pilha esteja
		 * vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a
		 * pilha está vazia.
		 */

		
		Stack<String> pilha = new Stack<String>();

		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("********************************************************\n");
			System.out.println("       1 - Adicionar Livro na Pilha");
			System.out.println("       2 - Listar todos os Livros");
			System.out.println("       3 - Retirar Livro da Pilha");
			System.out.println("       0 - Sair\n");
			System.out.println("********************************************************");
			System.out.print("Entre com a Opção Desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
						
			switch (opcao) {
			case 1 -> {
				System.out.print("\nDigite o nome: ");
				pilha.push(leia.nextLine());
				System.out.println("\nLivro adicionado!");
			}
			case 2 -> {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia! ");
				} else {
					System.out.println("\nLista de Livros na Pilha: \n");
					Iterator<String> iterator = pilha.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
			}

			case 3 -> {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					pilha.pop();
					System.out.println("\nUm Livro foi retirado da pilha: " + "\n");
					Iterator<String> iterator = pilha.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());

					}
				}
			}

			case 0 -> System.out.println("\nPrograma Finalizado!");

			default -> System.out.println("\nOpção inválida. Tente novamente.");
			}
		} while (opcao != 0);

		leia.close();
	}
	
	
}
