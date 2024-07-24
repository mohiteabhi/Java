import java.io.*;
class Prog1_Ascending{
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
		for(int j = 0; j < arr.length - 1; j++){
			if(arr[j] < arr[j + 1]){
			
			}
			else{
				flag++;
			}
		}
		if(flag == 0){
			System.out.println("Array is in ascending order");
		}
		else{
			System.out.println("Array is not in Ascending order");
		}
	}
}
