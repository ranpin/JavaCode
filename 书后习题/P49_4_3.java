public class P49_4_3{
public static void main(String args[]){
	double m=1,sum=0;
	int i=1;

	/*do{
	     m=m*(1.0/i);
	     sum=sum+m;
	     i++;
	}while(i<=20);*/

	for(;i<=20;i++){
	     m=m*(1.0/i);
	     sum=sum+m;
	}
	System.out.println("sum="+sum);
}
}