import java.io.*;
class Prog8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		
		for(int i = 1; i <= rows; i++){
			int temp = rows - i + 1;
			for(int j = 1; j <= rows - i + 1; j++){
			if(i % 2 == 1){
				System.out.print(temp-- + " ");
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
 * 4 3 2 1
 * C B A
 * 2 1
 * A
 */
