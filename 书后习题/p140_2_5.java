class A{
	static int m;
	static void f(){
		m=20;		//A
	}
}
class B extends A{
	static void f()	//B
	{m=222;		//C
	}
}
class p140_2_5{
	public static void main(String args[]){
		A.f();			//D
	}

}