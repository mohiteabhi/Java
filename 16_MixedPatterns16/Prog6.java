import java.io.*;
class Prog6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number of rows= ");
		int rows = Integer.parseInt(br.readLine());
		
	
		for(int i = 1; i <= rows; i++){
			int temp = rows;
			int ch = rows;
			for(int j = 1; j <= i; j++){
				if(i % 2 != 0){
					System.out.print((char)(ch + 96) + " ");
					ch--;
				}
				else{
					System.out.print(temp-- + " ");
				}
			}
			System.out.println();
		}
	}
}
//c
//3 2
//c b a
