public class Forloop{
	public static void 	main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
			}
			if(i==50){
				//break;// if i==50 then all itraion stoped
				continue;
			}
		}
	}
}