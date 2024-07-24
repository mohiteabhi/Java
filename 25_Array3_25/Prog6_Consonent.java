class Prog6_Consonent{
	public static void main(String[] args){
		char arr[] = {'a', 'b', 'c', 'y', 'x', 'o', 'p'};
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u'){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
