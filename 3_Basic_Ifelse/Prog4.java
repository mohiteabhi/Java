class Prog4{
	public static void main(String[] args){
		char ch = 'X';
		if(ch >= 'a' && ch <= 'z'){
			System.out.println(ch + " is a lowercase character");
		}
		else if(ch >= 'A' && ch <= 'Z'){
			System.out.println(ch + " is a Uppercase character");
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}
