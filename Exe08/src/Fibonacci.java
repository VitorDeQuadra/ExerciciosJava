import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		int z = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero da sua escolha...");
		int solicitacao = scanner.nextInt();
		
System.out.println("_______________________________________________");
		
		System.out.println("0");
		
		for (int i = 0; i <= solicitacao; i++) {
			
			z = y;
			y += x;
			x = z;
			
			System.out.println(z);
		}
		
	}

}
