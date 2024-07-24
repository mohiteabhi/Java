import java.io.*;
class Prog3{
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

		int count = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] == key){
				count++;
			}
		}


		if(count > 2){
			System.out.println("Array: ");
			for(int k = 0; k < size; k++){
				if(key == arr[k]){
					arr[k] = key*key*key;
				}
				System.out.print(arr[k] + " ");
			}
		}
		else{
			System.out.println("Element not fount");
		}
	}
}
