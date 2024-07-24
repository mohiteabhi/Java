import java.io.*;
class Prog4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			int temp = rows;
			for(int j = 1; j <= i; j++){
				if(i % 2 == 1){
					System.out.print((char) (temp + 96) + " ");
					
				}
				else{
					System.out.print((char) (temp + 64) + " ");
					
				}
				temp--;
			}
			System.out.println();
		}
	}
}
//d
//D C
//d c b
//D C B A 
