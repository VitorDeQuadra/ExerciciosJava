import java.util.Scanner;

public class LeitorNumeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero...");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Digite outro numero...");
		double numero2 = scanner.nextDouble();
		
		System.out.print("Digite outro numero...");
		double numero3 = scanner.nextDouble();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		if (numero1 > (numero2 + numero3)) {
			System.out.println("O primeiro numero numero é maior que a soma dos outros dois");
		}
		
		if (numero1 == (numero2 + numero3)) {
			System.out.println("O primeiro numero é igual a soma dos outros dois");
		}
		else
		{
			System.out.println("O primeiro numero é menor que a soma dos outros dois");
		}
	}

}
