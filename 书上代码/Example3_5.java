public class Example3_5{
public static void main(String args[]){
	long sum=0,a=8,t=a,i;
	for(i=1;i<=12;i++){
		sum=sum+t;
		t=t*10+a;
	}
	System.out.println(sum);
}
}