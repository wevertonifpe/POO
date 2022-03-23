package avaliacao;


import java.util.Random;

public class lista2questao4 {
	
	public static void main(String[] args) {
		
		
		Random gerator = new Random();
		
		int[] list = new int[10];
		
		int[] prime = new int[10];
		

		for (int i = 0; i < list.length; i++) {
			list[i] = gerator.nextInt(11);
			System.out.print(list[i] + " :");
		}
		
		for (int i = 0; i < list.length; i++) {
			int x = 0;
			for(int j = 1; j <= list[i]+1; j++){
				if (list[i] == 0 || list[i] == 1) {
			
				}else if(list[i]%j == 0){
					x += 1;
				}
			}
			if (x == 2) {
				System.out.println("\n"+list[i]+" é primo");
				prime[i] = list[i];
			}
		}
	}
}


