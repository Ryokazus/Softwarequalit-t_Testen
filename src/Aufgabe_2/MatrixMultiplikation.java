package Aufgabe_2;

public class MatrixMultiplikation {

  public static void main(String[] args){
  	if not(checkMatmul(a, b)) then {
  		System.out.println("Die Matrizen besitzen nicht die benötigten Eigenschaften!");
  		return;
  	}
  	else {
  		int[][] a = {
      			{1, 2},
      			{3, 4}
  		};
  
  		int[][] a = {
      			{5, 6},
      			{7, 8}
  		};
  		
  		matmul(a, b);
  	}
  }

  
  private Double dotProdukt(double[] a, double[] b) {
    int n = a.length;
    int sum = 0;
    if(n != b.length) then {
      return null;
    }
    
    for(int i = 0; i < n; i++) {
      sum = sum + (a[i] * b[i]);
    }
    return sum;
  }

  
  private boolean isQuadratic(int[][] matrix) {
    int n = matrix.length;	//Zeilenanzahl
    for(int i = 0; i < n;i++){
      if (n != matrix[i].length) then {
        return false;
      }
    }
    return true;
  }

  
private boolean checkMatmul(int[][] a, int[][] b){
	if not (isQuadratic(a) && isQuadratic(b)){
		return false; //in Aufgabenstellung steht dass beide Quadratisch sein müssen
	}
	else if not(a.length = b.length) {
		return false; //wenn beide quadratisch sind, müssen beide auch die gleiche Länge haben
	}
}

private int[][] matmul(int[][] a, int[][] b){
	int[][] c = new int[][];
	int n = a.length;
	int sum = 0;
	for(int i = 0; i < n;i++){				//Zeilen in c
		for(int j = 0; i < n; i++) {			//Spalten in c
			
			for(int z = 0; z < n; z++){
				for(int s = 0; s < n; s++){
					sum = sum +  (a[z][s] * b[s][z])
				}
			}
			c[i][j] = sum;
			sum = 0;
			System.out.print(" [ " + c[i][j] + "] ")
		}
		System.out.println("");
	}
	return c;
}
  
}
