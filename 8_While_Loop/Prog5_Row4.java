class Prog5_Row4{
	public static void main(String[] args){
		int Row = 4;
		int i = 1;
		int num = 1;
		while(i <= Row){
			int j = 1;
			while(j <= Row){
				System.out.print(num + " ");
				num += 2;
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
}

/*
 1 3 5 7
 9 11 13 15
 17 19 21 23
 25 27 29 31
 */
