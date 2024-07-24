import java.io.*;
class Prog2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of rows= ");
		int rows = Integer.parseInt(br.readLine());

		int temp = rows;
		for(int i = 0; i <= rows - 1; i++){
			int temp2 = rows + i;
			for(int j = 1; j <= rows; j++){
				System.out.print((char)(temp + 64)+ "" + temp2-- + " ");
			}
			System.out.println();
		}
	}
}
