package avaliacao;

import java.util.Random;

public class lista2questao8 {

	public static void main(String[] args) {
		
		Random gerator = new Random();
		
		int []list = new int[100];
		
		float sum = 0;
		float avr = 0;
		
		for(int i=0;i<list.length;i++) {
			
			list[i] = gerator.nextInt(100);
			System.out.print(list[i] +": ");
			sum += list[i];
		}
		
		avr = sum/list.length;
		
		System.out.printf("\nMédia = %f", avr);
		
	}
	
}
