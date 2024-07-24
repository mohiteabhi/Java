import java.io.*;
class Prog10{
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
		System.out.print("Output: " + arr[0][0] +", "+ arr[0][arr.length - 1] + ", " + arr[arr.length-1][0] + ", " + arr[arr.length-1][arr.length-1]);		
	}
}
