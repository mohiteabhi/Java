import java.io.*;
class Prog1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		for(int i = 1; i <= rows; i++){
			int temp = i;
			for(int j = 1; j <= rows - i + 1; j++){
				System.out.print(temp++ + " ");
			}
			System.out.println();
		}
	}
}
/*
 * 1 2 3 4
 * 2 3 4
 * 3 4
 * 4
 *
 *
 *
 *
 */
