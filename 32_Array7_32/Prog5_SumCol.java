import java.io.*;
class Prog5{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Rows: ");
	        int row = Integer.parseInt(br.readLine());
		System.out.println("Col: ");
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int j = 0; j < col; j++){
			int sum = 0;
			for(int i = 0; i < row; i++){
				sum += arr[i][j];
			}
			System.out.println("Sum of coloumn "+ (j + 1) + "= "+ sum);
		}

	}
}
