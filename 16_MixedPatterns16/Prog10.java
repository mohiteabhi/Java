import java.io.*;
class Prog10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		long rev = 0;
		while(num > 0){
			long rem = num % 10;
			rev = rev * 10 + rem;		
			num /= 10;
		}
		long temp = rev;
		while(rev > 0){
			long rem2 = rev % 10;
			if(rem2 % 2 == 1){
				System.out.print(rem2*rem2 + ", ");
			}
			rev /= 10;
		}
	}
}
