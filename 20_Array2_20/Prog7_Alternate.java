import java.io.*;
class Prog7_Alternate{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array elements are: ");
		for(int j = 0; j < size; j++){
			if(size % 2 == 0){
				if(j % 2 == 0){
					System.out.println(arr[j]);
				}
			}
			else{
				System.out.println(arr[j]);
			}
		}
	}
}
