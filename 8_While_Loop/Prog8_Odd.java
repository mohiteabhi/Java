class Prog8_Odd{
	public static void main(String[] args){
		int num = 216985;
		while(num > 0){
			int rem = num % 10;
			if(rem % 2 != 0){
				System.out.print(rem + " ");
			}
			num /= 10;
		}
	}
}
