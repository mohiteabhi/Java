import java.io.*;
class Prog10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		
		for(int i = 1; i <= rows; i++){
			int temp = rows - i + 1;
			int val = (rows + 1) - rows;
			for(int j = 1; j <= rows - i + 1; j++){
			if(i % 2 == 0){
				System.out.print((char)(temp + 96) + " ");
				temp--;
			}
			else {
				System.out.print((char)(temp + 64) + " ");
				temp--;
			}
			}
			System.out.println();
		}
	}
}
/*
 * D C B A
 * c b a
 * B A
 * a
 */
