import java.io.*;
class Prog6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		int temp = rows;
		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp < i; sp++){
				System.out.print("\t");
			}
			for(int j = rows; j >= i; j--){
				System.out.print(temp + "\t");	
			}
			temp--;
			System.out.println();
		}
	}
}
/*  
 *  3 3 3
 *    2 2
 *      1
 */
