package algoritmoTrocadePaginas;

import java.util.LinkedList;
import java.util.Scanner;

public class Teste {

	private static Scanner scanner = new Scanner(System.in);
	private static int[] sequencias;

	public static void main(String[] args) {
		
		int opcao = 0;
		int i = 0;
		Quadro quadros = new Quadro();
		sequencias = null;
		
		do {
			System.out.println("Setup Inicial");
			System.out.println("Qtd de quadros : ");
			quadros.setNumQuadros(scanner.nextInt());
			System.out.println("Sequência de acessos : ");
			while(scanner.hasNext()){
				sequencias[i] = scanner.nextInt();
		    }
			quadros.setSeqdePaginas(sequencias);
			
			System.out.println("Algoritmo de Troca de Paginas");
			System.out.println("[1] FIFO");
			System.out.println("[2] LFU");
			System.out.println("[0] Sair do Sistema");
			opcao = scanner.nextInt();
		} while (opcao != 0);
		
		
		
		
		
//		scanner.nextLine();
//		System.out.println("Sequência de acessos : ");
//		
//		String[] stringReferencia = sequencia.split(";");
//
//		
//		
//
//		if (opcao == 1) {
//			// FIFO
//			AlgoritmoDeSubstituicao fifo = new AlgoritmoFifo(qtdQuadros);
//
//			for (int i = 0; i < (stringReferencia.length - 1); i++) {
//				fifo.inserir(stringReferencia[i]);
//			}
//			System.out.println("Número de falha de páginas : " + fifo.getPageFaultCount());
//
//		} else if (opcao == 2) {
//			// LRU
//			AlgoritmoDeSubstituicao lru = new AlgoritmoLRU(qtdQuadros);
//
//			for (int j = 0; j < (stringReferencia.length - 1); j++) {
//				lru.inserir(stringReferencia[j]);
//			}
//			System.out.println("Número de falha de páginas " + lru.getPageFaultCount());
//
//		} else {
//			System.out.println("Opção inválida");
//		}

	}
}
