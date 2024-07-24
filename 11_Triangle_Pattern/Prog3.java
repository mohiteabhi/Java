import java.io.*;
class Prog3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows="+rows);

		for(int i = 1; i <= rows; i++){
			int ch = i;
			for(int j = 1; j <= i; j++){
				System.out.print((char)(ch + 64) + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
/*
 
 
 
 A
 B C
 C D E
 D E F G
 
 
 
 */




