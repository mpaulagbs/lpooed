import java.util.Scanner;
public class Lista2_questao5 {
	
	public static void andar(double quilometragem, Carro auto) {
		if((quilometragem/auto.getEficiencia()) <= auto.getCombustivel()) {
			auto.andarAutomovel(quilometragem);
			System.out.println("Voce utilizou "+ quilometragem/auto.getEficiencia() + " litro(s) de combustível");
		} else {
			System.out.println("Voce precisa reabastecer o automovel");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double eficiencia;
		double quilometragem;
		double combustivel;
		int opcao;
		
		System.out.println("Abasteca seu automovel (l):");
		combustivel = sc.nextDouble();
		System.out.println("Digite a eficiencia do automovel (km/l):");
		eficiencia = sc.nextDouble();
		
		Carro auto = new Carro(eficiencia, combustivel);
		
		while(true) {
			System.out.println("1. Andar\r\n" + 
					"2. Reabastecer\r\n" + 
					"3. Verificar a quantidade de combustível restante\r\n" + 
					"4. Encerrar a viagem");
			opcao = sc.nextInt();
			if(opcao == 4) {
				break;
			}
			else if(opcao == 1) {
				System.out.println("Informe a quilometragem a ser percorrida (km): ");
				quilometragem = sc.nextDouble();
				andar(quilometragem, auto);
				
			} 
			else if (opcao == 2) {
				System.out.println("Insira a quantidade de combustivel");
				auto.reabastecer(sc.nextDouble());	
			}
			else if (opcao == 3) {
				System.out.println("Restam "+ auto.getCombustivel() + " litro(s) de combustivel");
			}
	}
}}
