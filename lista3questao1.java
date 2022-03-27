package avaliacao;


public class lista3questao1 {
	
	public static void main(String[] args) {
		

		int [][] matrizA =  {{3,4},{5,6},{7,8}};
		int [][] matrizB =  {{10,1},{3,5},{0,21}};
		int [][] matrizC = new int[3][2];
		
		if(matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length) {
		
		
			for(int i=0;i<matrizA.length;i++) {
				
				for(int j=0;j<matrizA[0].length;j++) {
					
					matrizC[i][j] = matrizA[i][j] + matrizB[i][j] ;
					
				}
			}
			
			System.out.println("Matriz Resultado: ");
			
			for(int i=0;i<matrizA.length;i++) {
				
				for(int j=0;j<matrizA[0].length;j++) {
					
					System.out.printf("pos[%d][%d] =  %d ",i,j,matrizC[i][j]);
					
				}
				System.out.println("");
			}
			
			
		}else {
			System.out.println("impossível efetuar soma meu guerreiro");
		}
		
		
	}

}
