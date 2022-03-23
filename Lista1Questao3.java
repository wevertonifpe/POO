package avaliacao;
import java.util.Scanner;
public class Lista1Questao3 {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Maior");
		float Maior_base = entry.nextFloat()/100;
		System.out.println("Menor");
		float Menor_base = entry.nextFloat()/100;
		System.out.println("Altura");
		float Altura = entry.nextFloat()/100;
		
		
		float area = ((Maior_base+Menor_base) * Altura) / 2 ; 
				
		System.out.printf("area %f" , area);

		
		
		
		
	}
	
}
