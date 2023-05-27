public class Example3_7{
public static void main(String args[]){
	int sum=0,i,j;
	for(i=1;i<=10;i++){		//计算10以内的奇数
		if(i%2==0)
		continue;
		else sum=sum+i;
	}
	System.out.println("10以内的奇数和:"+sum);
	for(j=2;j<=100;j++){		//输出100以内的素数
	for(i=2;i<=j/2;i++){
		if(j%i==0)
		break;
		}
	if(i>j/2)
	System.out.println(j);
	}	
}
}	