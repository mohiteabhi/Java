import java.io.*;
class Prog8_Occ{
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
		System.out.println("Enter the character to check");
		char ch = (char)(br.read());
		br.skip(1);
		int count = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] == ch){
				 count++;
			}
		}
		System.out.println(ch + " occurs " + count + " times in the given array");
	}
}
