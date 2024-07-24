import java.io.*;
class Prog1_Descending{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter the elements of the array: ");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int flag = 0;
		for(int j = 0; j < size - 1; j++){
			if(arr[j] > arr[j + 1]){
				
			}
			else{
				flag++;
			}
		}
		if(flag == 0){
			System.out.println("Given array is in descending order.");
		}
		else{
			System.out.println("Given array is not in descending order");
		}
	}
}
