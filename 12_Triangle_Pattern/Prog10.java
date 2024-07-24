import java.io.*;
class Prog10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		int temp = 1;
		for(int i = 1 ; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				if(i % 2 != 0){
					System.out.print(temp + " ");
				}
				else{
					System.out.print((char)(temp + 96) + " ");
				}
				temp++;
			}System.out.println();	
		}
	}
}
//1
//b c
//4 5 6 

