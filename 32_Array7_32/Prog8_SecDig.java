import java.io.*;
class Prog8{
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
		int sum = 0;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if((i + j) == arr.length - 1){
					sum += arr[i][j];
				}
				else{
				
				}
			}
		}
		System.out.println("Secondary Diagnoal sum: " + sum);
	}
}
