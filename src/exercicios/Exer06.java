package exercicios;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		float raio;
		raio = entrada.nextFloat();
		
		float area =(float) (Math.PI*(raio*raio));

		System.out.println("A area do circulo é: "+area);
		
		entrada.close();
		
	}

}
