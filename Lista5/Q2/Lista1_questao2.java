import java.util.Scanner;
public class Lista1_questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Retangulo2 classe = null;
		double base, altura;
		
		System.out.println("digite uma opção, entre 1 e 3");
		int opcao = teclado.nextInt();		
		switch (opcao) {
		
		case 1:
			System.out.println("escreva a base do retangulo");
			base = teclado.nextDouble();
			System.out.println("escreva a altura do retangulo");
			altura = teclado.nextDouble();
			classe = new Retangulo2 (base, altura);
			//*break;
		case 2:
			System.out.println(classe.getArea());
			//*break;
		case 3:
			System.out.println(classe.getPerimetro());
			//*break;
		case 0:
			break;
        
        }}

}
