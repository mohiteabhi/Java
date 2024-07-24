import java.io.*;
class Prog5{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());
	
		int temp = rows + 65;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				System.out.print((char)(temp++) + " ");
			}
			System.out.println();
		}
	}
}
//D
//E F
//G H I
