import java.util.*;
class Prog10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		char arr[] = new char[size];
		System.out.println("Enter char");
		for(int i = 0; i < size; i++){
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("Enter char to print ch above ");
		char ch = sc.next().charAt(0);
		System.out.println("Output:");
		for(int j = 0; j < size; j++){
			if(ch == arr[j]){
				break;
			}
			else if(arr[j] != ch){
				System.out.println(arr[j]);
			}
		}
	}
}
