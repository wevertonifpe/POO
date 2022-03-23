package avaliacao;

import java.util.Random;

public class lista2questao6 {
	
	public static void main(String[] args) {
		
			Random gerator = new Random();
		
			int[] list = new int[100];
			
			for(int i=0;i<list.length;i++) {
				
				list[i] = gerator.nextInt(10);
				System.out.print(list[i] + " ");
			}
			System.out.println("");
			for(int i=0;i<list.length;i++) {
				
				System.out.println(list[i]%2==0?list[i]+"é par":"");
				
				
			}	
		}
	}

