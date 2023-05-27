import java.util.*;
class Example2_5{
public static void main(String args[]){
	int start=0,end,middle;
	int a[]={12,45,67,89,123,-45,67};
	int N=a.length;
	for(int i=0;i<N;i++){		//选择法排序数组
	for(int j=i+1;j<N;j++){
		if(a[j]<a[i]){
		a[j]=a[j]^a[i];
		a[i]=a[j]^a[i];
		a[j]=a[j]^a[i];
		}
	}
	}
	Scanner scanner=new Scanner(System.in);
	System.out.println("输入整数，程序判断该整数是否在数组中：");
	int number=scanner.nextInt();
	int count=0;
	end=N;
	middle=(start+end)/2;
	while(number!=a[middle]){
		if(number>middle)
			start=middle;
		else if(number<middle)
			end=middle;
		middle=(start+end)/2;
		count++;
		if(count>N/2)
		break;
	}	
	if(count>N/2)
	System.out.println("%d不在数组中",number)；
	else System.out.println("%d在数组中",number)；
}
}
		
	
	