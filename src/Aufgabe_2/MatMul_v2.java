package Aufgabe_2;

public class MatMul_v2 {

  public static void main(String[] args){
    int[][] a = createMatrix(20)
  	Duration previousTime = measureMatmul(a, a);
  	for(int n = 40; n <= 1280; i = i * i){
  		a = createMatrix(n);
  		Duration currentTime = measureMatmul(a, a);
  		System.out.println("Zeit Vergleich für n = " + n + ": " (currentTime/previousTime))
  		previousTime = currentTime;
  	}
  }

  private int[][] createMatrix(int n) {
  	int[][] matrix = new int[n][n];
  	for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          matrix[i][j] = 2;
      }
    }
  	return matrix;
  }


  static public Duration measureMatmul(int a[][], int b[][]) {
  	Instant start = Instant.now();
  	int c[][] = matmult(a, b);
  	Instant stop = Instant.now();
  	return Duration.between(start,stop);
  }


  private int[][] transponieren(int[][] a){
  	int[][] transponiert = new int[a[0].length][a.length];
  	for (int i = 0; i < a.length; i++) {
              for (int j = 0; j < a[0].length; j++) {
                  transponiert[j][i] = a[i][j];
              }
        }
  	return transponiert;
  }

  
  private int[][] matmul(int[][] a, int[][] b){
  	int[][] c = new int[][];
  	int[][] bTransponiert = transponieren(b);
  	for(int i = 0; i < a.length;i++){				//Zeilen
  		for(int j = 0; i < a.length; i++) {			//Spalten
  			c[i][j] = dotProdukt(a, bTransponiert);
  			System.out.print(" [ " + c[i][j] + "] ")
  		}
  		System.out.println("");
  	}
  	return c;
  }
}
