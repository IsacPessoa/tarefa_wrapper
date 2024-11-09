package br.com.ilima;

import java.util.Scanner;

public class Conversao {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = scanner.nextInt();
		
		Integer numero = num;
		
		System.out.println("Numero digitado depois da conversão: " + numero);
		
	}
	
}
