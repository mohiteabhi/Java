import java.io.*;
class Prog4_Occ{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Emter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter elements to check: ");
		int numCheck = Integer.parseInt(br.readLine());
		int count = 0;
		for(int j = 0; j < size; j++){
			if(arr[j] == numCheck){
				count++;
			}
		}
		if(count > 2){
			System.out.println(numCheck + " occured more than 2 times in array");
		}

	}
}
