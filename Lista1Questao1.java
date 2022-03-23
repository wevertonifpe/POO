package avaliacao;

import java.util.Scanner; ;

public class Lista1Questao1 {
	
	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		int Num_int = 0;
		float Num_float = 0 ;
		long Num_long = 0 ;
		
		Num_int = entry.nextInt();
		System.out.printf("numero inteiro %d",Num_int);
		
		Num_float = entry.nextFloat();
		System.out.printf("numero flutuante %f",Num_float);

		Num_long = entry.nextLong();
		System.out.printf("numero long %d",Num_long);
		
	}
	
}
