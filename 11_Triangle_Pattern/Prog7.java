import java.io.*;
class Prog7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows: " + rows);

		int temp = rows;
		for(int i = 1; i <=rows; i++){
			for(int j = 1; j <= temp; j++){
				System.out.print(j + " ");
			}
			temp--;
			System.out.println();
		}
	}
}
//Input: 3
//1 2 3
//1 2
//1
