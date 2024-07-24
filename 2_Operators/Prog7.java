class Prog7{
	public static void main(String[] args){
		int num = 100;
		
		num--;  //num = 99                    128 64 32 16 8 4 2 1
                                                    // 0  1  1  0  0 0 1 1
		System.out.println(num << 1);      //  1  1  0  0  0 1 1 0
		//198
		
		
		num = num >>> 1;                 //    0  1  1  0  0 0 1 1 
						//     0  0  1  1  0 0 0 1	
	
		num += 3;  //49 + 3 = 52
		System.out.println(num); //52
	}
}
