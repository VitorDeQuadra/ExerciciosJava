import java.util.Scanner;

public class CalculaDivisores {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero qualquer...");
		int numero = scanner.nextInt();
		
		int i = 0;
		
		for ( i = 1; i <= numero; i++) {
			
			if (numero % i  == 0) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
