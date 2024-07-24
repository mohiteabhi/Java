import java.io.*;
class Prog9_Palindrome{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input:" );
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int rev = 0;
		
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(temp == rev){
			System.out.println(temp + " is a palindrome number");
		}
		else{
			System.out.println(temp + " is not a palindrome number");
		}

	}
}
