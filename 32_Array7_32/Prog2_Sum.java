import java.io.*;
class Prog2_Sum{
	int sum = 0;
	int sumArray(int arr[][]){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; i++){
				sum += arr[i][j];
			}

		}
		return sum;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(br.readLine());
		System.out.print("Enter Coloumn: ");
		int col = Integer.parseInt(br.readLine());
		int arr[][] = new int[row][col];

		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; i++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}

		}
		Prog2_Sum obj = new Prog2_Sum();
		int arraySum = obj.sumArray(arr);
		
	}
}
