public class Example3_7{
public static void main(String args[]){
	int sum=0,i,j;
	for(i=1;i<=10;i++){		//����10���ڵ�����
		if(i%2==0)
		continue;
		else sum=sum+i;
	}
	System.out.println("10���ڵ�������:"+sum);
	for(j=2;j<=100;j++){		//���100���ڵ�����
	for(i=2;i<=j/2;i++){
		if(j%i==0)
		break;
		}
	if(i>j/2)
	System.out.println(j);
	}	
}
}	