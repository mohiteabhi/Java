import java.io.*;
class Prog3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows = " + rows);
		int temp = rows;

		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows; j++){
				if(j == 1){
					System.out.print(temp*temp + "\t");
				}
				else{
					System.out.print(temp + "\t");
				}temp++;
			}
			System.out.println();
		}
	}
}