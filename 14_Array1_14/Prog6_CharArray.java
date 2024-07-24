import java.io.*;
class Prog6_CharArray{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of array");
		int size  = Integer.parseInt(br.readLine());

		char arr[] = new char[size];
		System.out.println("Enter char array elements");
		for(int i = 0; i < size; i++){
			arr[i] = (char)(br.read());
		}
		
		for(int j = 0; j < size; j++){
			System.out.print(arr[j] + ",");
		}
	}
}
