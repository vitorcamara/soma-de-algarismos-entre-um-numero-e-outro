package com.vitorcamara.projetos;

import java.util.Scanner;

public class SomaNumerosEntreEles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		boolean valido = true;
		int num1;
		int num2;
		
		do {
		System.out.println("Digite o primeiro numero:");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero:");
		num2 = scan.nextInt();
		
			if(num1 <= num2) {
				valido = true;
			}
			else {
				valido = false;
				System.out.println("O primeiro número não pode ser maior que o segundo.");
				
			}
		
		} while(!valido);
		
		for (int i = num1; i <= num2; i++) { //o contador recebe o primeiro numero fornecido e contará até o segundo número fornecido
			
			soma += i; //soma recebe o contador que agora somará todos os números que estão entre o primeiro e o segundo número
		}
		
		System.out.println("A soma dos numeros: " + soma);

	}

}
