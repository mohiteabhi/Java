import java.io.*;
class Prog1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input: ");
		int input = Integer.parseInt(br.readLine());

		System.out.println("Factors of " + input + " are ");
		int temp = 1;
		while(temp <= input){
			if(input % temp == 0){
				System.out.print(temp + ", ");
			}
			temp++;
		}
	}
}
