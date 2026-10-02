package Arrays;

public class diagonalmatrix {

	public static void main(String[] args) {
		int [][] matrix= {
				{5,0,0},
				{0,-2,0},
				{0,0,1}};
		
		boolean isdiagonal=true;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(i!=j && matrix[i][j]!=0) {
					isdiagonal=false;
					break;
				}
			}
		}
		if(isdiagonal) {
			System.out.println("the matrix is Diagonal Matrix");
		}
		else {
			System.out.println("it is not diagonl matrix");
		}
		

	}

}
