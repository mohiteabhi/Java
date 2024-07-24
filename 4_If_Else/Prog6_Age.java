class Prog6_Age{
	public static void main(String[] args){
		int age = -31;
		if(age > 0 && age > 18){
			System.out.println("Valid age for Voting");
		}
		else if(age > 0 && age < 18){
			System.out.println("Invalid");
		}
		else{
			System.out.println("Invalid age");
		}
	}
}
