package exercicios;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float valor, horas, salario;
		
		System.out.print("Informe quanto você recebe por hora trabalhado: ");
		valor = entrada.nextFloat();
		
		System.out.print("Informe quantas horas você trabalha por mês: ");
		horas = entrada.nextFloat();
		
		salario = horas * valor;

		System.out.println("O seu salário será: "+salario+" reais por mês.");
		
		entrada.close();
		

	}

}
