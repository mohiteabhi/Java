import java.io.*;
class Prog3_SumRow{
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
			int sum = 0;
			for(int j = 0; j < col; j++){
				sum += arr[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + " = " + sum);
		}
	}
}
