package atividadeDiaSeis;

import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		
		
		//Variaveis
		float salario;
		float abono;
		float novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Olá");
		System.out.println("Digite o valor do seu salário: ");
		salario = leia.nextFloat();
				
	    System.out.println("Digite o valor do seu abono: ");
		abono = leia.nextFloat();
		
		//Processamento
		novosalario = salario + abono;
		
		//Saida de dados
		System.out.println("Seu novo salário é: " + novosalario);
		
		
		
		
	}

}
