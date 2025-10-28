package Aufgabe_2;

import java.time.*;

public class MatMult {

  public static void main(String[] args){
    int[][] a = createMatrix(20);
  	Duration previousTime = measureMatmul(a, a);
  	for(int n = 40; n <= 1280; n = n + n){
  		a = createMatrix(n);
  		Duration currentTime = measureMatmul(a, a);
		double ratio = (double) currentTime.toNanos()/previousTime.toNanos();
		System.out.printf("Zeit Vergleich für n = %d: %.2f%n", n, ratio);
  		previousTime = currentTime;
  	}
  }

  private static int[][] createMatrix(int n) {
  	int[][] matrix = new int[n][n];
  	for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          matrix[i][j] = 2;
      }
    }
  	return matrix;
  }


  public static Duration measureMatmul(int a[][], int b[][]) {
  	Instant start = Instant.now();
  	int c[][] = matmult(a, b);
	//System.out.println("Skalarprodukt für n = " + a.length + ": " + a[0][0]);
  	Instant stop = Instant.now();
  	return Duration.between(start,stop);
  }


  private static int[][] transponieren(int[][] a){
  	int[][] transponiert = new int[a[0].length][a.length];
  	for (int i = 0; i < a.length; i++) {
              for (int j = 0; j < a[0].length; j++) {
                  transponiert[j][i] = a[i][j];
              }
        }
  	return transponiert;
  }

  
  private static int[][] matmult(int[][] a, int[][] b){
  	int n = a.length;
	int[][] c = new int[n][n];
  	int[][] bTransponiert = transponieren(b);

  	for(int i = 0; i < n;i++){				//Zeilen
  		for(int j = 0; j < n; j++) {			//Spalten
  			c[i][j] = MatMul.dotProduct(a[i], bTransponiert[j]);
  		}
  	}
  	return c;
  }
}
