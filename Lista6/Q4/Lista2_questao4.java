import java.util.ArrayList;
import java.util.Scanner;

public class Lista2_questao4 {
	public static void calculaImposto(imposto funcionario) {
		if (funcionario.getSalario() <= 2000 ) {
			System.out.println(funcionario.getNome() + " esta isento de imposto.");
		} else if (funcionario.getSalario() >= 2000.01 && funcionario.getSalario() <= 3500  ) {
			System.out.println(funcionario.getNome() + " vai pagar " + funcionario.getSalario()*0.15 + " reais de imposto.");
		} else if (funcionario.getSalario() >= 3500.01 && funcionario.getSalario() <= 5000 ) {
			System.out.println(funcionario.getNome() + " vai pagar " + funcionario.getSalario()*0.22 + " reais de imposto."); 
		} else if (funcionario.getSalario() >= 5000.01) {
			System.out.println(funcionario.getNome() + " vai pagar " + funcionario.getSalario()*0.30 + " reais de imposto." );
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		String buscaFuncionario;
		double salario;
		imposto novocadastro = null;
		ArrayList<imposto> lista = new ArrayList<imposto>();
		int opcao;

		while(true){
			System.out.println("1. Cadastrar funcionário\r\n" + 
					"2. Calcular imposto (procurar funcionário pelo nome)\r\n" + 
					"0. Sair");
			opcao= sc.nextInt();
			sc.nextLine();
			
			if(opcao == 0) {
				break;
			}
			else if(opcao == 1) {
				System.out.println("Digite o nome do funcionario");
				nome = sc.nextLine();
				System.out.println("Digite o salario do funcionario");
				salario = sc.nextDouble();
				
				novocadastro = new imposto(nome, salario);
				lista.add(novocadastro);
			}
			else if(opcao == 2) {
				System.out.println("Digite o nome do funcionario");
				buscaFuncionario = sc.nextLine();			
				
				for (int i=0; i<lista.size(); i++) {
					if (buscaFuncionario.equals(lista.get(i).getNome())) {
						calculaImposto(lista.get(i));
					}
				}
			}
		}
	}}
	
