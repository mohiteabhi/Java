import java.io.*;
class Prog6_VowCon{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = (char)(br.read());
			br.skip(1);
		}
		int vowelCount = 0;
		int consoCount = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] == 'a' || arr[j] == 'A' || arr[j] == 'e' || arr[j] == 'E' || arr[j] == 'i' || arr[j] == 'I' || arr[j] == 'o' || arr[j] == 'O' || arr[j] == 'u' || arr[j] == 'U'){
				vowelCount++;
			}
			else{
				consoCount++;
			}
		}
		System.out.println("Count of vowels: " + vowelCount);
		System.out.println("Count of consonants: " + consoCount);

	}
}
