import java.io.*;
class Prog9{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		int temp = (rows * rows) + (rows - 1);	
		for(int i = 1; i <= rows; i++){
			
			int val = (rows + 1) - rows;
			for(int j = 1; j <= rows - i + 1; j++){
				System.out.print(temp + " ");
				temp -= 2;
			}
			System.out.println();
		}
	}
}
/*
 *
 *
 * 19 17 15 13
 * 11 9  7
 * 5  3
 * 1
 * 
 *
 */
