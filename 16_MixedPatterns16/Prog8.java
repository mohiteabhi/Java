import java.io.*;
class Prog8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of rows= ");
		int rows = Integer.parseInt(br.readLine());
		
		int ch = rows * (rows + 1) / 2;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows-i+1; j++){
				System.out.print((char)(ch + 64) + " ");	
				ch--;
			}
			System.out.println();
		}
	}
}
//F E D
//C B
//A
