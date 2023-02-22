import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

	public static void main(String[] args) {
		
		int numeroJogador = 0;
		int tentativasJogador = 0;
		
		Random random = new Random();
		int numeroSecreto = random.nextInt(0, 100);
		
		Scanner scanner = new Scanner(System.in);
		
		while (numeroJogador != numeroSecreto)
		{
			tentativasJogador++;
			
			System.out.print("Digite um numero...");
			numeroJogador = scanner.nextInt();
			
			if (numeroJogador < numeroSecreto) {
				System.out.println("O numero secreto é maior");
				System.out.println("______________________________________________________");
			}
			else
			{
				System.out.println("O numero secreto é menor");
				System.out.println("______________________________________________________");
			}
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Párabens, você acertou, utilizando "+ tentativasJogador +" tentativas");
		
	}	
		
}
	

