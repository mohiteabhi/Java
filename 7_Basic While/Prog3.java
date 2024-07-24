class Prog3{
	public static void main(String[] args){
		int range = 50;
		while(range <= 100){
			if(range % 4 == 0 && range % 7 == 0){
				System.out.print(range + " ");
			}
			range++;
		}
		System.out.println();
	}
}
