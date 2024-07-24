import java.io.*;
class Prog7_Div4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Array Element");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int index = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] % 4 == 0){
				index = j;
				System.out.println(arr[j] + " is divisible by 4 and its index is " + index);
			}
		}
	}
}
