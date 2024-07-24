import java.io.*;
class Prog10_Max{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[0];
		int index = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] > max){
				max = arr[j];
				index = j;
			}
		}
		System.out.println("Maximum number in the array is found at pos " + index + " is " + max);
	}
}
