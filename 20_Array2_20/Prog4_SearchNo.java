import java.io.*;
class Prog4_SearchNo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size = ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the number to search in array: ");
		int element = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < size; j++){
			if(arr[j] == element){
				System.out.print(element + " found at index " + j);
				break;
			}
		}
	}
}
