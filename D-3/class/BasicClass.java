public class BasicClass{
	//int color=10;//without static >>  error: non-static variable color cannot be referenced from a static context
	static int color=10;// static memory 
	static public int add(int x,int y){
		return x+y;
	}
	
	
	int b;// non static member only acces in heap memory
	int multiply(int x,int y){
		return x*y;
	}	
	public static void main(String[] args){
		System.out.println(color);
		int c=add(23,27);
		System.out.println(c);// print as out put
		
		int 		name=	10;
		BasicClass object1=new BasicClass();// new object creating  and objects creating in heap memory
		// int results=object1.add(1,2);// add is static memory member
		BasicClass object2=new BasicClass();
		int results=object1.multiply(1,2);
		System.out.println(results);
		
		object1.b=100;
		System.out.println("object1.b="+object1.b);
		object2.b=200;
		System.out.println("object2.b="+object2.b);
		
		/*object1=object2;
		System.out.println("object1.b="+object1.b);*/
		
		object1=object2;
		System.out.println("object1.b="+object1.b);
		
		object2=null;// thorw error null pointer Exception
		if(object2!=null){
			System.out.println("object2.b="+object2.b);
		}
	}
}