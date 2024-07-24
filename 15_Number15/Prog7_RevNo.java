import java.io.*;
class Prog7_RevNo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input: ");
		int num = Integer.parseInt(br.readLine()); //7853

		int val = 0;
		int temp = num;
		while(num > 0){
			int rem = num % 10;
			val = val * 10 + rem;
			num /= 10;
		}
		System.out.println("Reverse of " + temp + " is " + val);
		
	}
}
