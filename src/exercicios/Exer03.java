package exercicios;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número ");
		int number1 = entrada.nextInt();
		System.out.println("Digite outro número");
		int number2 = entrada.nextInt();
		
		System.out.println("a soma é: "+(number1+number2));
	}

}
