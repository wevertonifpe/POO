package avaliacao;
import java.util.Scanner;
public class Lista1Questao2 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		float imc = 0 ;
		
		System.out.println("peso: ");
		float peso = entry.nextFloat();
		
		System.out.println("altura: ");
		float altura = entry.nextFloat();

		imc = peso/(altura*altura);
		
		System.out.printf("\n Imc %f",imc);
		
		
	}
	
}
