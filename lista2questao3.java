package avaliacao;

import java.util.Random;

public class lista2questao3 {
	
	public static void main(String[] args) {
		
		Random gerator = new Random();
		

		int[] list = new int[100];
				
			//Alimentação do array
			for (int i = 0; i < list.length; i++) {
				list[i] = gerator.nextInt(10);
				
				}
			
			System.out.println("lista");
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i] + ", ");
			}
				
			System.out.println("\n\nlista inversa");
			for (int j = 10-1; j >= 0; j--) {
				System.out.print(list[j] + ", ");
		}

	}
}