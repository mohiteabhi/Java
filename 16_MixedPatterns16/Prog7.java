import java.io.*;
class Prog7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of rows= ");
		int rows = Integer.parseInt(br.readLine());
		
		int temp = 1;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows-i+1; j++){
				System.out.print(2 * temp++ + " " + "\t");	
			}
			System.out.println();
		}
	}
}
//2  4  6  8
//10 12 14
//16 18
//20
