package Uninter;

import java.util.Scanner;

public class Menu {
	
		private Scanner callScanner;
		private Cofrinho cofrinho;
	
	//fiz outro método chamando o scanner
	public Menu () {
		callScanner = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	//abri um método com as opções para o usuario
	public void exibirMenuPrincipal () {
		System.out.println("COFRINHO");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - listar moedas");
		System.out.println("4 - Calcular valor total convertido para real");
		System.out.println("0 - Encerrar");
		
		String optionSelect = callScanner.next();
		
		//fiz em forma de switch para que o código fique mais limpo de visualização e facilite para o programador futuramente
		switch (optionSelect) {
		case "0":
			System.out.println("Finished System, thank you for choice us.");
			
			break;
		
		case "1":
			System.out.println("Escolha uma moeda:\n 1 - Real \n 2 - Dólar\n 3 - Euro");
			
			
			int opcaoMoeda = callScanner.nextInt();
//			System.out.println("Voce escolheu a moeda: " + opcaoMoeda);
			
			System.out.println("Digite o valor:");
//			String valorMoeda = callScanner.next();
			String valorTextual = callScanner.next();
			valorTextual = valorTextual.replace(",", ".");
//			System.out.println("O valor da moeda é: " + valorTextual);
			double valorMoeda = Double.valueOf(valorTextual);
			
			Moeda moeda = null; 
			
			
			if (opcaoMoeda == 1) {
				 moeda = new Real(valorMoeda);
				
			}else if (opcaoMoeda == 2) {
				moeda = new Dolar(valorMoeda);
				
				
			}else if (opcaoMoeda == 3) {
				moeda = new Euro(valorMoeda);
				
				
			}else {
				System.out.println("Não existem essa moeda!");
				exibirMenuPrincipal();
				
			}
			
			cofrinho.adicionar(moeda);
			System.out.println("Moeda Adicionada!");
			
			
			
			exibirMenuPrincipal();
			
			break;
			
		case "2":
			exibirSubMenuRemoverMoedas();
			exibirMenuPrincipal();
		
			
			break;
			
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
			
		case "4":
			double valorTotalConvertido = cofrinho.valorTotalConvertido();
			System.out.println("O valor total convertido para real: " + valorTotalConvertido);
			
			break;
			
		default:
			System.out.println("Opção Inválida, tente novamente");
			exibirMenuPrincipal();
			break;
		}

		
	}
	
	private void exibirSubMenuRemoverMoedas(){
		
		System.out.println("Escolha uma moeda:\n 1 - Real \n 2 - Dólar\n 3 - Euro");
		
		
		int opcaoMoeda = callScanner.nextInt();
//		System.out.println("Voce escolheu a moeda: " + opcaoMoeda);
		
		System.out.println("Digite o valor:");
//		String valorMoeda = callScanner.next();
		String valorTextual = callScanner.next();
		valorTextual = valorTextual.replace(",", ".");
//		System.out.println("O valor da moeda é: " + valorTextual);
		double valorMoeda = Double.valueOf(valorTextual);
		
		Moeda moeda = null; 
		
		
		if (opcaoMoeda == 1) {
			 moeda = new Real(valorMoeda);
			
		}else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
			
			
		}else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
			
			
		}else {
			System.out.println("Não existem essa moeda!");
			exibirMenuPrincipal();
			
		}
		
		cofrinho.remover(moeda);
		
		
		
		
		
		
	}
	


}
