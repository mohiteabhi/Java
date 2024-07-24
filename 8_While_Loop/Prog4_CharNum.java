class Prog4_CharNum{
	public static void main(String[] args){
		int start = 1;
		int end = 6;
		while(start <= end){
			if(start % 2 != 0){
				System.out.print((char)(start + 64) + " ");
			}
			else{
				System.out.print(start + " ");
			}
			start++;
		}
	}
}
//A 2 C 4 E 6
