package exercicios;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota");
		int nota1 = entrada.nextInt();
		System.out.println("Digite uma nota");
		int nota2 = entrada.nextInt();
		System.out.println("Digite uma nota");
		int nota3 = entrada.nextInt();
		System.out.println("Digite uma nota");
		int nota4 = entrada.nextInt();
		
		System.out.println("O número informado é: "+((nota1+nota2+nota3+nota4) / 4));

	}

}
