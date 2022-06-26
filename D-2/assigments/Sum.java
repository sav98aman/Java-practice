public class Sum{
	static int sum(int n){
		int sum=((n*(n+1)/2));
		return sum;
	}

	public static void 	main(String[] args){
		int n=9;
		//int res=sum(n);
		//System.out.println(res);
		Sum obj_sum=new Sum();
		int res=obj_sum.sum(n);
		System.out.println(res);
		
	}
	
}
