import java.io.*;
class Prog5_Merge{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array1: ");
		int size1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the elements of the array1: ");
		int arr1[] = new int[size1];
		for(int i = 0; i < size1; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter the size of the array2: ");
		int size2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the elements of the array2: ");
		int arr2[] = new int[size2];
		for(int i = 0; i < size2; i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array after merger: ");
		int arr3[] = new int[size1+size2];
		int temp = 0;
		for(int i = 0; i < size1 + size2; i++){
			if(i >= size1){
				arr3[i] = arr2[temp];
				temp++;		
			}
			else{
				arr3[i] = arr1[i];
			}
		}
		for(int k = 0; k < size1+size2; k++){
			System.out.print(arr3[k] + " ");
		}
	}
}
