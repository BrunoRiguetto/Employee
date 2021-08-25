package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Desconto de salário: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		
		System.out.print("Quantos porcento de aumento de salário? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Atualização: " + emp);
		
		sc.close();
	}

}
