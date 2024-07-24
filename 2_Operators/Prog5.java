class Prog5{
	public static void main(String[] args){
		int val1 = 5; // 0 1 0 1
		int val2 = 3; // 0 0 1 1
		System.out.println(val1 & val2); //0 0 0 1 : 1
		System.out.println(val1 | val2); //0 1 1 1 : 7
		System.out.println(val1 ^ val2); //0 1 1 0 : 6
		System.out.println(val1 << 1);   //1 0 1 0 : 10
		System.out.println(val1 >> 1);   //0 0 1 0 : 2
	}
}
