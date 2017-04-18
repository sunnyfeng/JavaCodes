public class MatrixOps{

/*	public static void main (String[] args){
		double [][] m1 = {{1,2}, {3,4}, {5,6}};
		double [][] m2 = {{7,8,9},{10,11,12}};
		printMatrix(multiply(m1,m2));

	}

	public static void printMatrix(double[][] matrix)
	{
		for (int row = 0 ; row < matrix.length ; row++)
		{
			for (int col = 0 ; col < matrix[0].length ; col++)
			{
				System.out.print(matrix[row][col] + "\t");
			}
			System.out.println();
		}
	}
	*/

	public static double[][] multiply(double[][] matrix1, double[][] matrix2){
		int row1 = matrix1.length;
		int col1 = matrix1[0].length;
		int row2 = matrix2.length;
		int col2 = matrix2[0].length;
		//rows of A by columns of B
		double[][] product = new double[row1][col2];

		if (col1 == row2){
			for (int i = 0; i < row1; i++){
				for (int j = 0; j < col2; j++){
					for (int k = 0; k< col1; k++){
						product[i][j] += matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			return product;
		}else {
			return null; // replace this line with your code
		}

	}
}
