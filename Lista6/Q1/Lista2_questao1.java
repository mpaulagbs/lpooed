import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista2_questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Funcionarios1 func = null;
		List<Funcionarios1> funcionarios = new ArrayList<Funcionarios1>();
		String nome;
		double salarioFunc = 0;
		int opcao;
		
		while(true){
			System.out.println("digite a opcao desejada \n1 = cadastras um funcionario \n2 = exibir os funcionarios de alta renda" + "\n0 = sair");
			opcao= sc.nextInt();
			sc.nextLine();
			
			if(opcao == 1) {
				System.out.println("digite o nome do funcionario: ");
				nome = sc.nextLine();
				System.out.println("digite o salario do funcionario: ");
				salarioFunc = sc.nextDouble();
				func = new Funcionarios1(nome, salarioFunc);
				funcionarios.add(func);
			}
			if(opcao == 2) {
				isBiggerThan(funcionarios);
			}if(opcao == 0) {
				break;
			}
		}

	}
	
	public static void isBiggerThan(List<Funcionarios1> funcionarios) {
		for (int i=0; i<funcionarios.size(); i++) {
			if (funcionarios.get(i).getsalarioFunc() > 5000) {
				System.out.println(funcionarios.get(i).getnomeFunc());
				System.out.println(funcionarios.get(i).getsalarioFunc());
			}	
		}
	}
}
