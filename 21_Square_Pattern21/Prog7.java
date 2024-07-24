import java.io.*;
class Prog7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows = " + rows);

		int temp = rows;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				if(temp % 2 == 1){
					System.out.print((char)(64 + i) + "\t");
				}
				else{
					System.out.print(temp + "\t");
				}temp++;
			}
			System.out.println();
		}
	}
}
/*
 * A 4 A
 * 6 B 8
 * C 10 C
 */
