package avaliacao;

import java.util.Random;

public class lista2questao7 {
	
	public static void main(String[] args) {
		
		Random gerator = new Random();
		
		int []list = new int[100];
		
		int large = 0;
		int small = 99999;
		
		for(int i=0;i<list.length;i++) {
			
			list[i] = gerator.nextInt(100);
			
			System.out.print(list[i] +" ");
			
			if(list[i]>large) {
				
				large = list[i];
			}
			if(list[i]<small) {
				
				small = list[i];
			}
		}
		
		System.out.printf("\nmaior : %d\n",large);
		System.out.printf("menor : %d",small);
		
	}

}
