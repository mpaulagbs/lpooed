import java.util.Scanner;
import java.util.ArrayList;
public class Lista2_questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		double peso;
		double altura;
		Imc i = null;
		ArrayList<Imc> lista = new ArrayList<Imc>();
		int opcao;

		while(true){
			System.out.println("1. Cadastrar uma pessoa\r\n" + 
					"2. Mostrar as pessoas que estão abaixo do peso\r\n" + 
					"3. Mostrar as pessoas que estão dentro do peso ideal\r\n" + 
					"4. Mostrar as pessoas que estão acima do peso\r\n" + 
					"0. Sair");
			opcao= sc.nextInt();
			sc.nextLine();
			
			if(opcao == 0) {
				break;
			}

			if(opcao == 1) {
				System.out.println("digite o nome da pessoa: ");
				nome = sc.nextLine();
				System.out.println("digite o peso da pessoa ");
				peso = sc.nextDouble();
				System.out.println("digite a altura da pessoa");
				altura = sc.nextDouble();
				
				i = new Imc(nome, peso, altura);
				lista.add(i);
			}
			if(opcao == 2) {
				for(int count=0; count<lista.size();count++) {
					if(lista.get(count).getImc()<18.5) {
						System.out.println(lista.get(count).getNome() + " esta abaixo do peso");
					}
				}
			}
			if(opcao == 3) {
				for(int count=0; count<lista.size();count++) {
					if(lista.get(count).getImc()> 18.5 && lista.get(count).getImc()<25) {
						System.out.println(lista.get(count).getNome() + " esta no peso ideal");
					}
				}
			}
			if(opcao == 4) {
				for(int count=0; count<lista.size();count++) {
					if(lista.get(count).getImc() >= 25) {
						System.out.println(lista.get(count).getNome() + " esta acima do peso ideal");
					}
				}
			}
  }
 }
}
