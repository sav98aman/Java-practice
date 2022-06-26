public class Ifelse{
	public static void 	main(String[] args){
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a);
		// if else condition 
		if(a>b & a>c){
			System.out.println("A is grater than B");
		}
		else if(b>a & b>c){
			System.out.println("B is grater than A");
		}
		else {
			System.out.println("C is grater than A and b");
		}
		
		// nasted if else condition 
		if(a>b){
			if(a>c){
				System.out.println("A is grater than b and c");
			}else if(C>b){
				System.out.println("");
			}
		}
	}
}