import java.io.*;
class Prog9{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of rows= ");
		int rows = Integer.parseInt(br.readLine());
		
		int ch = rows + 64;

		for(int i = 1; i <= rows; i++){
			int temp = ch - i + 1;
		
			for(int j = 1; j <= rows-i+1; j++){
			
				if(i % 2 == 1){
					System.out.print(j + " ");
				}
				else{
					System.out.print((char)(temp--) + " ");
				}
			}
			
			System.out.println();
		}
	}
}
//1 2 3 4
//C B A
//1 2
//A
