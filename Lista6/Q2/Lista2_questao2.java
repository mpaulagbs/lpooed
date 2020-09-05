import java.util.ArrayList;
import java.util.Scanner;
public class Lista2_questao2 {
	
	public static void aprovado(ArrayList<Estudante2> lista) {
		
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getMedia() >= 6) {
				System.out.println("Aluno " + lista.get(x).getNome() + " foi aprovado");
				System.out.println("Média = " + lista.get(x).getMedia());
			}else {
				System.out.println("Aluno " + lista.get(x).getNome() + " foi reprovado");
				System.out.println("Média = " + lista.get(x).getMedia());
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Estudante2 e = null;
		ArrayList<Estudante2> lista = new ArrayList<Estudante2>();
		int opcao;
		double nota1, nota2;
		String nome, matricula;
		while(true) {
			System.out.println("1. Cadastrar um estudante\r\n" + 
					"2. Obter o nome do estudante (procurar pela matricula)\r\n" + 
					"3. Calcular a média (informar se o estudante foi aprovado ou não)\r\n" + 
					"0. Sair\r\n" + 
					"\r\n");
			opcao = teclado.nextInt();
			if(opcao == 0) {
				break;
			}
			else if(opcao == 1) {
				System.out.println("Digite o nome: ");
				nome = teclado.next();
				
				System.out.println("Digite a matricula: ");
				matricula = teclado.next();
				
				System.out.println("Digite a primeira nota: ");
				nota1 = teclado.nextDouble();
				
				System.out.println("Digite a segunda nota: ");
				nota2 = teclado.nextDouble();
				
				e = new Estudante2(nome, matricula, nota1, nota2);
				lista.add(new Estudante2(nome, matricula, nota1, nota2));
				
			}else if(opcao == 2) {
				System.out.println("Digite a matricula: ");
				matricula = teclado.next();
				lista.get(0).nome_matricula(lista, matricula);
			}else if(opcao == 3) {
				aprovado(lista);
			}else {
				System.out.println("Erro");
				return;
		
			}

		}}}
		


