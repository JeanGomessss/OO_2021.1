package classe;

import java.util.Scanner;

public class calcula {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, sum;
		
		System.out.println("Entre com o primeiro n�mero:");
		numero1 = input.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		numero2 = input.nextInt();
		
		sum = numero1 + numero2;
		
		System.out.printf("A soma � %d%n", sum);
		
		input.close();
	}

}
