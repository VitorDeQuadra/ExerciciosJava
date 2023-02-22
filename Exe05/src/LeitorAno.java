import java.util.Scanner;

public class LeitorAno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um ano de sua preferência...");
		int ano = scanner.nextInt();
		
		System.out.println("-----------------------------------------");
		
		if (ano % 400 == 0 || ano % 4 == 0) {
			System.out.println("O ano escolhido é bissexto");
		}
		else
		{
			System.out.println("O ano escolhido não é bissexto");
		}
	}

}
