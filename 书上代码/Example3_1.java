public class Example3_1{
public static void main(String args[]){
	char a[]={'ʮ','��','��','��'};
	char secret='z';
	System.out.println("������");
	for(int i=0;i<4;i++){
	a[i]=(char)(a[i]^secret);
	System.out.print(a[i]);
	}
	System.out.println("");
	System.out.println("ԭ����");
	for(int i=0;i<4;i++){
	a[i]=(char)(a[i]^secret);
	System.out.print(a[i]);
	}
}
}