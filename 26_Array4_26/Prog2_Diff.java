import java.io.*;
class Prog2_Diff{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int min = arr[0];
		int max = arr[0];
		for(int j = 0; j < size; j++){
			if(arr[j] < min){
				min = arr[j];
			}
			if(arr[j] > max){
				max = arr[j];
			}
		}
		System.out.println("Difference between minimum and maximum elements is: " + (max - min));
	}
}
