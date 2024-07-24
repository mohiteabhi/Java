import java.io.*;
class Prog2_FirstOcc{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("Specific number: ");
		int spNo = Integer.parseInt(br.readLine());
		int spIndex = 0;
		int flag = 0;
	
		for(int j = 0; j < size; j++){
			if(arr[j] != spNo){
				flag++;
			}
			else{
				System.out.println("num " + spNo + " first occured at index " + j);
				break;		
			}
		}
		if(flag == size){
			System.out.println("num " + spNo + " not found in array.");
		}
	}
}
