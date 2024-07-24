class Prog10_RealTime{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++){
			int routeNo = 1;
			while(routeNo <= 10){
				if(routeNo % 2 == 0){
					System.out.println("Go this way");
				}
				else{
					System.out.println("Go in  route no:" + (routeNo+ 1) );
				}
				routeNo++;
			}

		}
	}
}
