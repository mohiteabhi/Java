import java.io.*;
class Prog3_EvenEle{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of array: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Even Elements are: ");
		for(int j = 0; j < size; j++){
			if(arr[j] % 2 == 0){
			System.out.println(arr[j]);
			}
		}

	}
}
