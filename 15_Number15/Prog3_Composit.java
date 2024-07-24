import java.io.*;
class Prog3_Composit{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int temp = 1;
		while(temp <= num){
			if(num % temp == 0)
				count++;
			temp++;
		}
		if(count > 2){
			System.out.println(num + " is composite number");	
		}
		else{
			System.out.println(num + " is not a composite number");
		}
	}
}
