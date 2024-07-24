import java.io.*;
class Prog1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows="+rows);

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
/*
 
 
 
 1
 1 2
 1 2 3 4
 1 2 3 4 5
 
 
 
 */




