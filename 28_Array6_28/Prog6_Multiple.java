import java.io.*;
class Prog6_Multiple{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter the elements of the array: ");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Enter key: ");
		int key = Integer.parseInt(br.readLine());

		int flag = 0;

		for(int j = 0; j < size; j++){
			if(arr[j] != key){
				flag++;
			}
			if(arr[j] % key == 0){
				System.out.println("An element multiple of " + key + " fount at index: " + j);
			}
		}
		if(flag == arr.length){
			System.out.println("Element not found");
		}
	}
}
