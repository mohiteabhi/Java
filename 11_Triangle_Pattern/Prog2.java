import java.io.*;
class Prog2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows="+rows);

		for(int i = 1; i <= rows; i++){
			int num = rows;
			for(int j = 1; j <= i; j++){
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}
}
/*
 
 
 
 3
 3 2
 3 2 1
 
 
 
 */




