import java.io.*;
class Prog8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		int ch = 99;
		for(int i = 1 ; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				if(j % 2 == 0){
					System.out.print((char)(ch) + " ");
					ch += 2;
				}
				else{
					System.out.print(j + " ");
				}
			}System.out.println();	
		}
	}
}
//1
//2 a
//3 b 3

