import java.util.Scanner;

public class MediaAluno {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota...");
		double nota1 = scanner.nextDouble();
		
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("------------------------------");
			System.out.println("A primeira nota é invalida");
			return;
		}
		
		System.out.print("Digite a segunda nota...");
		double nota2 = scanner.nextDouble();
		
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("------------------------------");
			System.out.println("A segunda nota é invalida");
			return;
		}
		
		System.out.print("Digite a terceira nota...");
		double nota3 = scanner.nextDouble();
		
		if (nota3 < 0 || nota3 > 10) {
			System.out.println("------------------------------");
			System.out.println("A terceira nota é invalida");
			return;
		}
		
		System.out.print("Digite o total de faltas do aluno...");
		int faltas = scanner.nextInt();
		
		if (faltas < 0) {
			System.out.println("---------------------------------------");
			System.out.println("O numero de faltas é invalido");
			return;
		}
		System.out.println("_____________________________________________________________________");
		
		verificaAprovacao(nota1, nota2, nota3, faltas);
	}
	private static void verificaAprovacao(double nota1, double nota2, double nota3, int faltas) {
		double nota4 = 0;
		
		Scanner scanner = new Scanner(System.in);
		if (faltas > 7) {
			System.out.println("O Aluno reprovou por faltas");
			return;
		}
		
		if ((nota1 + nota2 + nota3)/3 >= 7) {
			System.out.println("Aluno Aprovado.");
			return;
		}
		
		if ((nota1+nota2+nota3)/3 >= 3 && (nota1 + nota2 + nota3)/3 <= 7) {
			System.out.println("Aluno em recuperação");
			System.out.println("---------------------------------------");
			
			System.out.print("Digite a quarta nota...");
			nota4 = scanner.nextDouble();
			
			System.out.println("----------------------------------------");
		}
		
		if ((nota1 +nota2 + nota3)/3 <= 3) {
			System.out.println("Aluno reprovado.");
			return;
		}
		
		if ((nota1 + nota2 + nota3 + nota4)/4 >= 5) {
			System.out.println("o aluno passou na recuperação.");
		}else
		{
			System.out.println("O aluno não passou na recuperação");
		}
		
	}
}
