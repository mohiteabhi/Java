class Prog5_NegSq{
	public static void main(String[] args){
		int arr[] = {-2 , 5 , -6 , 7 , -3 , 8 };
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 0){
				arr[i] *= arr[i];
			}
			
			System.out.print(arr[i] + " ");
		}
	}
}
