import java.util.Scanner;
public class Lista1_questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(java.util.Locale.ENGLISH);
		Estudante1 estud =null;
		String nome, matricula, end;
		double media = 0;
		int opcao;
		double [] array = new double[4];
		
		while(true){
			System.out.println("digite a opcao desejada \n1 = criar um estudante \n2 = calcular media" + "\n3 = obter matricula \n4 = obter endereco \n0 = sair");
			opcao= sc.nextInt();
			sc.nextLine();
			if(opcao == 1) {
				System.out.println("digite seu nome: ");
				nome = sc.nextLine();
				System.out.println("digite sua matricula: ");
				matricula = sc.nextLine();
				for(int i = 0; i < 4; i++) {
					System.out.println("digite as notas");
					array[i] = sc.nextDouble();
				//	media += array[i];
					sc.nextLine();
				}
				System.out.println("digite o endereco: ");
				end = sc.nextLine();
				estud = new Estudante1(nome,matricula,array,end);
			}else if(opcao == 2) {
				//double calc = media/4;
				System.out.println(estud.getMedia());
				
			}else if(opcao == 3) {
				System.out.println(estud.getMatricula());
			}else if(opcao == 4) {
				System.out.println(estud.getEnd());
			}else {
				break;
			}}
	}

}
