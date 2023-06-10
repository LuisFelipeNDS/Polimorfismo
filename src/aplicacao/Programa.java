package aplicacao;

import java.util.Scanner;
import entidades.Funcionario;
import entidades.FuncionarioTerceiro;
import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Funcionario> list = new ArrayList<>();

		System.out.print("Qual a quantidade de funcionario ?");
		int qtde = teclado.nextInt();
		
		for(int i=1; i<=qtde; i++) {
			System.out.printf("Funcionario %d %n", i);
			System.out.println("Terceirizado ? (Sim / Nao)");
			String terceiro = teclado.next();
			System.out.println("Nome:");
			String nome = teclado.next();
			System.out.println("Horas:");
			int horas = teclado.nextInt();
			System.out.println("Valor por hora:");
			double valorHoras = teclado.nextDouble();			
			
			if(terceiro.equals("Sim")) {
				System.out.println("CobranCa adicional:");
				double adicional = teclado.nextDouble();
				
				Funcionario f = new FuncionarioTerceiro(nome, horas, valorHoras, adicional);
				list.add(f);
			} else {
				Funcionario f = new Funcionario(nome, horas, valorHoras);
				list.add(f);
			}			
		}
		
		for(Funcionario fun : list) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("Pagamento:");
			
			System.out.printf("Funcionario: %s  - R$%.2f%n", fun.getNome(), fun.pagamento());
		}
	}

}
