import java.io.*;
class Prog4_SumOdd{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row = ");
		int row = Integer.parseInt(br.readLine());
		System.out.print("Enter column = ");
		int col = Integer.parseInt(br.readLine());
		int arr[][] = new int[row][col];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		for(int i = 0; i < row; i++){
			int sum = 0;
			if((i+1) % 2 == 1){
				for(int j = 0; j < col; j++){
					sum += arr[i][j];
				}	
			System.out.println("Sum of row " +  (i+1)+ " = " + sum);
			}
		}

	}

}
