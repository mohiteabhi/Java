import java.io.*;
class Prog4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows = " + rows);

		int num = rows * (rows + 1) / 2;
		int ch = num + 64;
		for(int i =1; i <=rows; i++){
			for(int j =1; j <=rows -i +1; j++){
			System.out.print((char)(ch--) + " ");
			}
			System.out.println();
		}
	}
}
/*
 * Inout: 3
 *
 * F E D
 * C B
 * A
 *
 *
 */
