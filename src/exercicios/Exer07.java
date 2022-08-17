package exercicios;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um lado do quadrado: ");
		float L;
		L = entrada.nextFloat();
		
		float area = L*L;

		System.out.println("A area do quadrado é: "+area);
		
		entrada.close();
		
	}

}
