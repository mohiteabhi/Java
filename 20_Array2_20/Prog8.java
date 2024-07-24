import java.io.*;
class Prog8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < size; j++){
			if(arr[j] > 5 && arr[j] < 9){
				System.out.println(arr[j] + " is greater than 5 but less than 9");
			}
		}
	}
}
