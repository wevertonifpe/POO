package avaliacao;

public class lista3questao3 {
	
	public static void main(String[] args) {
		
		int [][] matrizA = {{3,4,5},{5,6,1}};
		int [][] matrizB = {{10,1},{3,5},{0,21}};
		int [][] matrizC = new int [2][2];
		
		if(matrizA[0].length == matrizB.length) {
			
			for(int i=0;i<matrizA.length;i++) {
				
				for(int j=0 ; j<matrizB[0].length;j++) {
					
					for (int k = 0; k < matrizB.length;k++) {
						
						matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
						
					}
					
					
				}
			}
			
			System.out.println("Matriz Resultado: ");
			
			for(int i=0;i<matrizA.length;i++) {
				
				for(int j=0;j<matrizB[0].length;j++) {
					
					System.out.printf("pos[%d][%d]= %d ",i,j,matrizC[i][j]);
				}
				System.out.println("");
			}
			

			
			
		}else {
			System.out.println("não dá pra multiplicar meu guerreiro");
		}
		
		
	}

}
