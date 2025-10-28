package Aufgabe_2;

public class MatMul {

  public static void main(String[] args){
	//Skalarprodukt
	int[] a = {1, 2, 3};
	int[] b = {4, 5, 6};

	if ((a.length != b.length) && (a.length == 0 || b.length == 0)) {
		System.out.println("Die Länge der Vektoren ist nicht zulässig");
	}
	int c = dotProduct(a, b);
	System.out.println("Das Skalarprodukt von a und b ist: " + c);

	//Matrixmultiplikation
	int[][] A = {
		  {1, 2},
		  {3, 4}
	};

	int[][] B = {
		  {5, 6},
		  {7, 8}
	};
	if (!checkMatmul(A, B)){
		System.out.println("Die beiden Matrizen können nicht* miteinander multipliziert werden");
	}
	else {
		int C[][] = matmul(A, B);
	}
  	}

  
  public static int dotProduct(int[] a, int[] b) {
  	int n = a.length;
    int sum = 0;
    
    for(int i = 0; i < n; i++) {
      sum = sum + (a[i] * b[i]);
    }
    return sum;
  }

  
  private static boolean isQuadratic(int[][] matrix) {
    int n = matrix.length;	//Zeilenanzahl
    for(int i = 0; i < n;i++){
      if (n != matrix[i].length){
        return false;
      }
    }
    return true;
  }

  
	private static boolean checkMatmul(int[][] a, int[][] b){
		if (!(isQuadratic(a) && isQuadratic(b))){
			return false; //in Aufgabenstellung steht dass beide Quadratisch sein müssen
		}
		else if (a.length != b.length) {
			return false; //wenn beide quadratisch sind, müssen beide auch die gleiche Länge haben
		}
		return true;
	}

	private static int[][] matmul(int[][] a, int[][] b){
		int n = a.length;
		int[][] c = new int[n][n];
		int sum = 0;
		//Schleife für Datainput in c
		for(int i = 0; i < n;i++) {                //Zeilen in c
			for (int j = 0; j < n; j++) {            //Spalten in c
				//Schleife für Operation
				for (int s = 0; s < n; s++) {
					sum = sum + (a[i][s] * b[s][j]);
				}
				c[i][j] = sum;
				sum = 0;
				System.out.print(" [ " + c[i][j] + " ] ");
			}
			System.out.println();
		}
		return c;
	}
}
