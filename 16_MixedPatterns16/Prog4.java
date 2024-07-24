import java.io.*;
class Prog4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of Rows= ");
		int rows = Integer.parseInt(br.readLine());
		
		int temp = rows;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(temp * j + " ");
			}
			temp--;
			System.out.println();
		}
	}
}
//3
//2 4
//1 2 3 
