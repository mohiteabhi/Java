import java.io.*;
class Prog1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		for(int i = 1; i <= rows; i++){
			int temp = rows;
			for(int j = 1; j <= rows; j++){
				if(i % 2 == 1){
					System.out.print((char)(64 + temp--) + " ");
				}
				else{
					System.out.print(rows + " ");
				}
			}
			System.out.println();
		}
	}
}
/*
 C B A
 3 3 3
 C B A
 */
