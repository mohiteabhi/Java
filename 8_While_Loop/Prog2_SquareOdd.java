class Prog2_SquareOdd{
	public static void main(String[] args){
		int start = 150;
		int end =  198;
		while(start < end){
			if((start * start) % 2 != 0){
				System.out.print(start + " ");
			}
			start++;
		}

	}
}
