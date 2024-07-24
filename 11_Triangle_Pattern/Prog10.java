import java.io.*;
class Prog10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Rows: " + rows);

		 
		for(int i = 1; i <= rows; i++){
			int temp = 64 + i;
		
			for(int j = 1; j <= rows - i + 1; j++){
				if(i % 2 != 0){  
					if(j % 2 != 0){
					System.out.print(temp + " ");
					temp++;					}
					else{
					System.out.print((char) (temp) + " ");
					temp++;
					}
					
				}
				else{
					if(j % 2 != 0){
					System.out.print((char) (temp) + " ");
					temp++;
					}
					else{
					System.out.print(temp + " ");
					temp++;
					}
					
				}
			}
			System.out.println();
		}
	}
}
//rows = 3
//A 66 C
//66 C
//C
