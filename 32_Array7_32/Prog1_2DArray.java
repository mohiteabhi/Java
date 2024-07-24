import java.io.*;
class Prog1_2DArray{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row = ");
		int rows = Integer.parseInt(br.readLine());
		System.out.print("Enter Column = ");
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[rows][col];

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < col; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < col; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
