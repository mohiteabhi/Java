import java.io.*;
class Prog3_Vowel{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size = ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];
		System.out.print("Enter elements");
		for(int i = 0; i < size; i++){
			arr[i] = (char)(br.read());
			br.skip(1);
		}

		for(int j = 0; j < size; j++){
			if(arr[j] == 'a' || arr[j] == 'A' || arr[j] =='e' || arr[j] == 'E' || arr[j] == 'i' || arr[j] == 'I' || arr[j] == 'o' || arr[j] == 'O' || arr[j] == 'u' || arr[j] == 'U' ){
				System.out.println("Vowel " + arr[j] + " found at index " + j);
			}
		}
	}
}
