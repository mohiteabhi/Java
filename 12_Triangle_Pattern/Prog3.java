import java.io.*;
class Prog3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			int temp = rows;
			for(int j = 1; j <= i; j++){
				System.out.print((char)(temp + 64 ) + " ");
				temp--;
			}
			System.out.println();
		}
	}
}
//C
//C B
//C B A
