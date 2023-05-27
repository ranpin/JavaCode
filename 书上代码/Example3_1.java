public class Example3_1{
public static void main(String args[]){
	char a[]={'十','点','进','攻'};
	char secret='z';
	System.out.println("密文是");
	for(int i=0;i<4;i++){
	a[i]=(char)(a[i]^secret);
	System.out.print(a[i]);
	}
	System.out.println("");
	System.out.println("原文是");
	for(int i=0;i<4;i++){
	a[i]=(char)(a[i]^secret);
	System.out.print(a[i]);
	}
}
}