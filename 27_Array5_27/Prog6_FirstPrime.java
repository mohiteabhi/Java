import java.io.*;
class Prog6_FirstPrime{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int j = 0; j < size; j++){
			int count = 0;
			for(int k = 1; k <= arr[j]; k++){
				if(arr[j] % k == 0){
					count++;
				}
			}
			if(count == 2){
				System.out.println("Prime at index " + j);
				break;
			}
		}
	}
}
