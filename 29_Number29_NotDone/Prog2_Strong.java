import java.io.*;
class Prog2_Strong{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int num = Integer.parseInt(br.readLine()); //145
		
		int temp = num;
		int factSum = 0;
		while(temp > 0){
			int fact = 1;
			int rem = temp % 10;
			for(int i = rem; i > 1; i--){
				fact *= i; 
			}
			factSum += fact;
			temp /= 10;
		}
		if(factSum == num){
			System.out.println(num + " is a Strong number");
		}
		else
			System.out.println(num + " is not a strong Number");

	}
}
