import java.io.*;
class Prog5{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		for(int i = 1; i <= rows; i++){
			int ch = 65;
			for(int j = 1; j <= rows - i + 1; j++){
			if(i % 2 == 1){
				System.out.print((char)(ch) + " ");
				ch++;
			}
			else {
				System.out.print((char)(ch + 32) + " ");
				ch++;
			}
			}System.out.println();
		}
	}
}
/*
 * A B C 
 * a b 
 * A
 */
