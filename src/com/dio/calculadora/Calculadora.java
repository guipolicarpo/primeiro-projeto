package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int sub = subtracao(a, b);
		int div = divisao(a, b);
		int mult = multiplicacao(a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + sub);
		System.out.println("Divisao: " + div);
		System.out.println("Multiplicacao: " + mult);

	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
