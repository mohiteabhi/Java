import java.io.*;
class Prog9{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		int ch = 97;
		for(int i = 1 ; i <= rows; i++){
			int temp = rows + 1;
			for(int j = 1; j <= i; j++){
				if(j % 2 != 0){
					System.out.print(temp + " ");
					temp += 2;
				}
				else{
					System.out.print((char)(ch++) + " ");
				}
			}System.out.println();	
		}
	}
}
//4
//4 a
//4 b 6

