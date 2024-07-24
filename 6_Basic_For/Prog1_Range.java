class Prog1_Range{
	public static void main(String[] args){
		int num = 100;
		if(num >= 1 && num <= 1000){
			System.out.println(num + " is in the range 1 to 1000");
		}
		else if(num < 1){
			System.out.println(num + " is not in the range 1 to 100");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}
