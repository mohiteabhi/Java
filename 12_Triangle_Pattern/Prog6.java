import java.io.*;
class Prog6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());
	
		int ch = 65;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				if(i % 2 == 1){
					System.out.print(j + " ");
				}
				else{
					System.out.print((char)(ch) + " ");
				}
				ch++;
			}
			System.out.println();
		}
	}
}
//1
//B C
//1 2 3

