import java.util.Scanner;

public class LeitorVelocidade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a velocidade permitida na Avenida...");
		int velocidadeAvenida = scanner.nextInt();
		
		if (velocidadeAvenida< 0) {
			System.out.println("------------------------------------------------");
			System.out.println("Velocidade invalida");
		}
		
		System.out.print("Digite a velocidade do motorista...");
		int velocidadeMotorista = scanner.nextInt();
		
		if (velocidadeMotorista < 0) {
			System.out.println("------------------------------------------------");
			System.out.println("Velocidade invalida");
		}
		
		
		System.out.println("____________________________________________________");
		
		if (velocidadeMotorista > (velocidadeAvenida + 31)) {
			System.out.println("Multa infligida de 200 reias");
			return;
		}
		
		if (velocidadeMotorista > (velocidadeAvenida + 11) || velocidadeMotorista >= (velocidadeAvenida + 30)) {
			System.out.println("Multa infligida de 100 reias");
			return;
		}
		
		if (velocidadeMotorista >= (velocidadeAvenida + 10) || velocidadeMotorista >= (velocidadeAvenida + 6)) {
			System.out.println("Multa infligida de 50 reias");
			return;
		}
		else
		{
			System.out.println("O motorista respeitou a velocidade");
		}

	}

}
