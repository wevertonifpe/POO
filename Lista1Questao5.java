package avaliacao;
import java.util.Scanner;
public class Lista1Questao5 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("num");
		int num = entry.nextInt();
		
		
		System.out.println( num%2 == 0 ?"é par":"ímpar");
	}
	
}
