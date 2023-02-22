import java.util.Scanner;

public class GerarMatriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o numero de linhas...");
		int linhas = scanner.nextInt();
		
		System.out.print("Informe o numero de colunas...");
		int colunas = scanner.nextInt();
		
		if (linhas != colunas) {
			System.out.println("O numero de linhas e colunas não corresponde");
			return;
		}
		
		System.out.println("-----------------------------------------------");
		
		for (int l = 0; l < linhas; l++) {
			
			for (int c = 0; c < colunas; c++) {
				
				if (l == c) {
					System.out.print(" 1 ");
				}
				else
				{
					System.out.print(" 0 ");
				}
				
			}
			System.out.println();
		}

	}

}
