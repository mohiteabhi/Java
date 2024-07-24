class Prog7{
	public static void main(String[] args){
		int arr[] = {121 , 144 , 225 , 88 , 90 , 89};
		for(int i = 0; i < arr.length; i++){
			if(arr.length % 2 == 1 && arr.length >= 5){
				if(arr[i] % 2 == 1){
					System.out.print(arr[i] + " ");
				}
			}
			else{
				if(arr[i] % 2 == 0){
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
