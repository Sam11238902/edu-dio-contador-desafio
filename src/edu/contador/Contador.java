package edu.contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int parametroUm = scanner.nextInt();
	
		System.out.println("Digite o segundo numero");
		int parametroDois = scanner.nextInt();

		try {
			contar(parametroUm, parametroDois);

		} catch (ContadorException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
	}
	
	

	static void contar(int parametroUm, int parametroDois) throws ContadorException {

		if (parametroUm > parametroDois) {
			throw new ContadorException();
		}

	
			int total = parametroDois-parametroUm;
			
			for (int x = 0; x < total; x++) {
				System.out.println("contando : " + (x + 1));
			}

		

	}
}
