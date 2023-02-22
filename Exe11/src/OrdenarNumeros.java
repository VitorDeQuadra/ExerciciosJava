import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos elementos você quer??...");
		int elementosUsusario = scanner.nextInt();
		
		List<Integer>elementos = new ArrayList<Integer>();
		
		for (int i = 0; i < elementosUsusario; i++) {
			
			System.out.print("Qual é o elemento?...");
			int numerosUsusario = scanner.nextInt();
			
			Integer numero = (numerosUsusario); 
			
			elementos.add(numero);
		}
		elementos.sort(null);
		
		System.out.println("________________________________");
		
		for (Integer numero : elementos ) {
			System.out.print("  "+ numero);
		}
	}

}
