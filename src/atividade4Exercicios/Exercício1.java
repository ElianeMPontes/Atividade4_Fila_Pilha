package atividade4Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		/* Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada
		  dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		  1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		  2: Listar todos os Clientes na fila
		  3: Chamar (retirar) uma pessoa da fila 
		  0: O programa deve ser finalizado. 
          Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.*/
		
		
			
	        Queue<String> fila = new LinkedList<>();
	        Scanner leia = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("********************************************************\n");
	            System.out.println("       1 - Adicionar Cliente na Fila");
	            System.out.println("       2 - Listar todos os Clientes");
	            System.out.println("       3 - Retirar Cliente da Fila");
	            System.out.println("       0 - Sair\n");
	            System.out.println("********************************************************");
	            System.out.print("Entre com a Opção Desejada: ");
	            opcao = leia.nextInt();
	            leia.nextLine();
	            
	            
	            switch (opcao) {
	                case 1:
	                    System.out.print("\nDigite um nome: ");
	                    String nome = leia.nextLine();
	                    fila.add(nome);
	                    System.out.println("\nFila:");
	                    for (String cliente : fila) {
	                        System.out.println(cliente);
	                    }
	                    System.out.println("\nCliente Adicionado!\n");
	                    break;
	                    
	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        System.out.println("\nLista de Clientes na Fila:");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;
	                    
	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        fila.poll();
	                        System.out.println("\nFila:");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                        System.out.println("\nO Cliente foi Chamado!");
	                    }
	                    break;
	                    
	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);

	        leia.close();
	    }
	}
