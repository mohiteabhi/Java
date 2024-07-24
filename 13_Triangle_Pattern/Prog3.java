import java.io.*;
class Prog3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		int temp = rows * (rows + 1);
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows - i + 1; j++){
				System.out.print(temp + " ");
				temp -= 2;
			}System.out.println();
		}
	}
}
/*
 * 20 18 16 14
 * 12 10 8
 * 6  4
 * 2
 */
