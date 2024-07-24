class Prog8{
	public static void main(String[] args){
		int num = 15;
		if(num % 2 == 0 && num % 5 == 0 && num % 10 == 0){
			System.out.println(num + " is Divisible by 2, 5, 10");
		}
		
		else{
			System.out.println(num + " is Not Divisible by 2, 5, 10");
		}
	}
}
