package atividadeDiaSeis;

import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
	
		//Variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediafinal;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Olá");
		System.out.println("Digite o valor da nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite o valor da nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite o valor da nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite o valor da nota 4: ");
		nota4 = leia.nextFloat();
		
		//Processamento
		mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Saida de dados
		System.out.println("Sua média final é: " + mediafinal);
		
		
		

	}

}
