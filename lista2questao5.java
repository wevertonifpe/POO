package avaliacao;

import java.util.Random;

public class lista2questao5 {
	
	public static void main(String[] args) {
		
			Random gerator = new Random();
		
			int[] list = new int[100];
			
			for(int i=0;i<list.length;i++) {
				
				list[i] = gerator.nextInt(10);
				System.out.print(list[i] + " ");
			}
			for(int i=0;i<list.length;i++) {
				
				System.out.println(list[i]%2==0?"":list[i]+" é impar");
				
				
			}	
		}
	}

