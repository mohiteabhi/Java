import java.io.*;
class Prog5{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp <= rows - i; sp++){
				System.out.print("\t");
			}
			for(int j = 1; j <= i; j++){
				System.out.print((i * j) + "\t");	
			}
			System.out.println();
		}
	}
}
/*  1
  2 4
3 6 9
 */
