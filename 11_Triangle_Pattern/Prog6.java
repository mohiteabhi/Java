import java.io.*;
class Prog6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows: " + rows);

		int k = 1;
		for(int i = rows; i > 0; i--){
			for(int j = 1; j <= rows - k + 1; j++){
				System.out.print(i + " ");
			}
			k++;
			System.out.println();
		}
	}
}
//Input: 3
/*
 3 3 3
 2 2
 1
 */
