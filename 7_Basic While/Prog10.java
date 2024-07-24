class Prog10{
	public static void main(String[] args){
		int num = 100;
		while(num >= 24){
			if(num % 4 == 0 && num % 5 == 0){
				System.out.print(num + " ");
			}
			num--;
		}
		System.out.println();
	}
}
