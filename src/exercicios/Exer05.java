package exercicios;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float mt,cm;
		
		System.out.print("Digite quantos metros sera convertido: ");
		mt = entrada.nextFloat();
		
		cm = mt * 100;

		System.out.println(mt+" metro(s) � equivalente a "+cm+" centimetro(s).");
		
		entrada.close();

	}

}
