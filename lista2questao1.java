package avaliacao;

import java.util.Scanner;

public class lista2questao1 {

	
	public static void main(String[] args) {
		
				Scanner entry = new Scanner(System.in);
				
				
				int[] list = new int[5];
				int sum = 0;
				int avr = 0;
				
				
				System.out.println("Bem vindo a calculadora de média aritmética, por favor informe números inteiros.\n");
				
				for (int i = 0; i < list.length; i++ ){
					
					System.out.print("digite o "+(i+1)+"º ==> ");
					
					list[i] = entry.nextInt();
					
					sum += list[i];
				}
				
				avr = sum/list.length;
				
				System.out.println("A média é: "+ sum);
		
	}
}
