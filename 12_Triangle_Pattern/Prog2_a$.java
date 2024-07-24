import java.io.*;
class Prog2_a${
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				if(i % 2 != 0){
					System.out.print((char)(j + 96) + " ");
				}
				else{
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}
}
//a
//$ $
//a b c
