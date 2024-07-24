import java.io.*;
class Prog5_Fact{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println("Input =" + num);

		int fact = num;
		int temp = 1;
		while(temp < num){
			fact = fact * temp ;
			temp++;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}
