import java.util.Scanner;
public class Lista1_questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Circulo3 classe = null;
		double r, perimetro;
		
		System.out.println("digite uma opção entre 1 e 3");
		int opcao = teclado.nextInt();
		switch (opcao) {
		
		case 1:
			System.out.println("escreva o valor de r");
			r = teclado.nextInt();
			perimetro = teclado.nextInt();
			classe = new Circulo3 (r, perimetro);
			
		case 2:
			System.out.println(classe.getR());
			
		case 3:
			System.out.println(classe.getPerimetro());
			
		case 0:
			break;
		}
		
	}

}
