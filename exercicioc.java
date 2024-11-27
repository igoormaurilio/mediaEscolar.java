package aula10;

import java.util.Scanner;

public class exercicioc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a nota A");
		double n1 =scn.nextDouble();
		
		System.out.println("Digite a nota B");
		double n2 = scn.nextDouble();
				
		System.out.println("Digite a nota C");
		double n3 = scn.nextDouble();
		
		System.out.println("Digite a nota D");
		double n4 = scn.nextDouble();
		
	
		double nota = (n1 + n2 + n3 + n4) / 4;
		System.out.println("Média final é: " + nota);
		
		
		if (nota >= 5) {
			System.out.println("Aprovado!");
		}
		else {
		System.out.println("Reprovado :( ");
	}
	}
}
