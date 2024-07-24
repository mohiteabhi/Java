import java.io.*;
class Prog3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int ch = rows;
		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp <= rows - i; sp++){
				System.out.print("\t");
			}
			for(int j = 0; j <= i-1; j++){
				System.out.print((char)(ch + 64 + j) + "\t");
				
			}
			ch--;
			System.out.println();
		}
	}
}
/*
     C
   B C
 A B C

 */
