import java.io.*;
class Prog8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows: " + rows);

		for(int i = 1; i <= rows; i++){
			int temp = i;
			for(int j = 1; j <=rows-i+1; j++){
				System.out.print(temp++ + " ");
				
			}
			System.out.println();
		}
	}
}
//Input: 3
//1 2 3
//2 3
//3
