import java.io.*;
class Prog1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Rows = ");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp <= rows - i; sp++){
				System.out.print("\t");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}


/*
    1
  1 2
1 2 3


*/
