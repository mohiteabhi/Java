import java.io.*;
class Prog9_OddIndex{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int j = 0; j < size; j++){
			if(j % 2 != 0){
				System.out.println(arr[j] + " is an odd indexed element");
			}
		}
	
	}
}
