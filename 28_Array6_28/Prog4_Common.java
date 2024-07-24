import java.io.*;
class Prog4_Common{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter the elements for array1: ");
		int arr1[] = new int[size];
		for(int i = 0; i < size; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the elements for array2: ");
		int arr2[] = new int[size];
		for(int j = 0; j < size; j++){
			arr2[j] = Integer.parseInt(br.readLine());
		}

		System.out.print("Common elements in given array are: ");
		for(int k = 0; k < size; k++){
			for(int l = 0; l < size; l++){
				if(arr1[k] == arr2[l]){
					System.out.print(arr1[k] + " ");
					break;
				}
			}
		}
	}
}
