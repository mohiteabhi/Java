import java.io.*;
class Prog9{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows: " + rows);

		int temp = rows;
		for(int i = 1; i <= rows; i++){
			int k = rows + 64;
			for(int j = temp ; j > 0; j--){
				System.out.print((char) (k) + " ");
				k--;
			}
			temp--;
			System.out.println();
		}
	}
}
//Input: 3
//
