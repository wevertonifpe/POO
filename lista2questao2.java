package avaliacao;

import java.util.Scanner;

public class lista2questao2 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		int[] list = new int[10];
	
		for(int i = 0; i < list.length; i++){
			System.out.print("Informe o "+(i+1)+"º número:");
			list[i] = entry.nextInt();
		}

		for (int i = list.length-1; i >= 0; i--){
			System.out.println(list[i]);
		}
	}
}