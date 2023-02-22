import java.util.Random;

public class GerarNumeros {

	public static void main(String[] args) {
		Random random = new Random();
		
		for (int i = 0; i < 20; i++) {
			int numero = random.nextInt(1000, 1999);
			if (numero % 11 == 5) {
				System.out.println(numero);
			}
		}
	}

}
