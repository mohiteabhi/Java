import java.io.*;
class Prog5{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows="+rows);

		for(int i = 1; i <= rows; i++){
			int temp = i;
			for(int j = 1; j <= i; j++){
				System.out.print((temp * j) + " ");
			}
			System.out.println();
		}
	}
}
/*
 
 
 
 3
 3 6
 3 6 9
 
 
 
 
 */




