import java.io.*;
class Prog6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		for(int i = 1; i <= rows; i++){
			int val = (rows + 1) - rows;
			for(int j = 1; j <= rows - i + 1; j++){
			if(j % 2 == 0){
				System.out.print((char)(val + 96) + " ");
				val++;
			}
			else {
				System.out.print(val + " ");
				
			}
			}System.out.println();
		}
	}
}
/*
 * 1 a 2 
 * 1 a
 * 1
 */
