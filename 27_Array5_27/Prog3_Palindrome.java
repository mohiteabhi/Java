import java.io.*;
class Prog3_Palindrome{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int flag = 0;
		for(int j = 0; j < size / 2; j++){
			if(arr[j] == arr[size - 1 - j]){
				
			}
			else{
				flag++;
			}
		}
		if(flag == 0){
			System.out.println("Given array is palindrome");
		}
		else{
			System.out.println("Given array is not palindrome");
		}
	}
}
