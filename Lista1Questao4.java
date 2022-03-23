package avaliacao;
import java.util.Scanner;
public class Lista1Questao4 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("num 1");
		int num1 = entry.nextInt();
		
		System.out.println("num 2");
		int num2 = entry.nextInt();
		
		System.out.printf( num1 > num2 ?"num 1 maior":"num 2 maior");
	}
	
}
