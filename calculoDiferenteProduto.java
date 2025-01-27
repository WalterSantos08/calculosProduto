/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

import java.util.Scanner;

public class nilo3 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = dados.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = dados.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int numero3 = dados.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		int numero4 = dados.nextInt();
		
		int diferencia = (numero1 * numero2 - numero3 * numero4);
		
		System.out.println("a diferencia entre os numero é: " + diferencia);
		
		dados.close();

	}

}
