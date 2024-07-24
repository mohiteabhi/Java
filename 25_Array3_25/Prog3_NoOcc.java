import java.io.*;
class Prog3_NoOcc{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = {2,5,2,7,8,9,2};
		
		System.out.print("Specific number: ");
		int spNo = Integer.parseInt(br.readLine());
		int count = 0;
		int flag = 0;
	
		for(int j = 0; j < arr.length; j++){
			if(arr[j] != spNo){
				flag++;
			}
			else{
				count++;		
			}
		}
		if(flag == arr.length){
			System.out.println("Number " + spNo + " not found in array.");
		}
		else{
			System.out.println("Number " + spNo + " occured " + count + " times in an array");
		}
	}
}
