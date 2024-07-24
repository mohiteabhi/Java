import java.io.*;
class Prog3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of rows = ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			int ch = rows + 64;
			for(int j = 1; j <= rows; j++){
				if(i % 2 != 0){
					System.out.print((char)(ch--) + " ");
				}
				else{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
//C B A
//1 2 3
//C B A
