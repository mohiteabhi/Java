import java.io.*;
class Prog9_Min{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int min = arr[0];
		for(int j = 0; j < size; j++){
			if(arr[j] < min){
				min = arr[j];
			}
		}
		System.out.println("Minimum number in the array is:- " + min);
	}
}
