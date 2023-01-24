import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int selecao;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("PESQUISA DE PREFERÊNCIA DE COMBUSTÍVEL");
		System.out.println("Seleciona um Combustível: \n"
				+ "1 - Álcool \n"
				+ "2 - Gasolina \n"
				+ "3 - Diesel \n"
				+ "4 - Finalizar \n");
		
		System.out.println("Informa o Combustível de Informado: ");
		selecao = sc.nextInt();
		
		while (selecao != 4) {
			System.out.println("Informa o Combustível ou Digite 4 para Finalizar: ");
			if (selecao == 1) {
				alcool += 1;
			}
			else if (selecao == 2) {
				gasolina += 1;
			}
			else if (selecao == 3) {
				diesel += 1;
			}
						
			selecao = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrgado");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
