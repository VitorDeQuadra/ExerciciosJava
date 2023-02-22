
import java.util.Scanner;

public class LeitorQuociente {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite um numero...");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Digite outro numero...");
		double numero2 = scanner.nextDouble();
		
		if (numero2 != 0) {
			System.out.println(numero1 / numero2 +" É o quociente dos dois numeros");
		}
		else 
		{
			System.out.println("DIVISÃO POR ZERO");
		}
	}

}

