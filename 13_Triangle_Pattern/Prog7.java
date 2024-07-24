import java.io.*;
class Prog7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		
		for(int i = 1; i <= rows; i++){
			int temp = rows - i + 1;
			int val = (rows + 1) - rows;
			for(int j = 1; j <= rows - i + 1; j++){
			if(j % 2 != 0){
				System.out.print(temp-- + " ");
			}
			else {
				System.out.print((char)(temp + 96) + " ");
				temp--;
			}
			}temp--;
			System.out.println();
		}
	}
}
/*
 * 4 c 2 a
 * 3 b 1
 * 2 a
 * 1
 */
