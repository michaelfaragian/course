package d;

public class MultiDim1 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][3];
        matrix [0][0] = 5;
        matrix [3][2] = 3;
        
        for (int i = 0; i < matrix.length; i++) {
        	for ( int a = 0; a< matrix[i].length; a++) {
			System.out.print(matrix[i][a] + ", ");
			}
        	System.out.println();
		}
        
        

	}

}
