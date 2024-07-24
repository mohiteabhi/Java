import java.io.*;
class Prog4_FirstDu{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Output: ");
		for(int j = 0; j < size; j++){
			for(int k = j + 1; k < size; k++){
				if(arr[j] == arr[k]){
					System.out.println("First Duplicate element present at index " + k);	
				}
				break;
			}
		}
	}
}
