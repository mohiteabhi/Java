import java.io.*;
class Prog2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		System.out.println("rows= " + rows);

		int num = 1;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows - i + 1; j++){
				System.out.print(num * 2 + " ");
				num++;
			}System.out.println();
		}
	}
}
