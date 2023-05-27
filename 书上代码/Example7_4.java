public class Example7_4{
	public static coid main(String args[]){
		int n=0,m=0,t=1000;
		try{m=Inter.parseInt("8888");
			n=Inter.parseInt("ab89");
			t=7777;
			}
		catch(NumberFormatException e){
			System.out.println("发生异常："+e.getMessage());
		}
		System.out.println("n="+n+",m="+m+",t="+t);
		try{
			(System.out.println("故意抛出i/o异常"));
			throw new java .io.IOException("我是故意的");	//故意抛出异常
			//System.out.println("这个输出语句肯定没办法执行，必须注释，否则编译出错");
		}	
		catch(java.io.IOException e){
		System.out.println("发生异常："+e.getMessage);
		}
	}
}