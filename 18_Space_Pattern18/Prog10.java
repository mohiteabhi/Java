import java.io.*;
class Prog10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows= ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp < i; sp++){
				System.out.print("\t");
			}
			int temp = 64 + i;
			for(int j = rows; j >= i; j--){
				if(rows % 2 == 0){
					if(i % 2 == 0){
						System.out.print((char)(temp++) + "\t");
					}
					else{
						if(j % 2 == 0){
							System.out.print((temp++) + "\t");
						}	
						else{
							System.out.print((char)(temp++) + "\t");
						}
					}
				}
				else if(rows % 2 != 0){
					if(i % 2 == 0){
						System.out.print(temp++ + "\t");
					}
					else{
						if(j % 2 != 0){
							System.out.print((char)(temp++) + "\t");
						}
						else{
							System.out.print(temp++ + "\t");
						}
					}
				}
			}
			System.out.println();
		}
	}
}
