import java.io.*;
class Prog8_SecMin{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int min = arr[0];
		for(int j = 0; j < size; j++){
			if(arr[j] < min){
				min = arr[j];
			}
		}
		int secMin = arr[0];
		for(int k = 0; k < size; k++){
			if(arr[k] < secMin && arr[k] > min){
				secMin = arr[k];
			}
		}
		System.out.println("Second Minimum element in the array is: " + secMin);
	}
}
