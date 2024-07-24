import java.io.*;
class Prog7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			int num = 1;
			for(int sp = 1; sp < i; sp++){
				System.out.print("\t");
			}
			for(int j = rows; j >= i; j--){
				System.out.print(num++ + "\t");	
			}
			System.out.println();
		}
	}
}
/*  
 *  1 2 3 4
 *    1 2 3
 *      1 2
 *        1
 */
