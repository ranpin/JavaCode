public class Example7_4{
	public static coid main(String args[]){
		int n=0,m=0,t=1000;
		try{m=Inter.parseInt("8888");
			n=Inter.parseInt("ab89");
			t=7777;
			}
		catch(NumberFormatException e){
			System.out.println("�����쳣��"+e.getMessage());
		}
		System.out.println("n="+n+",m="+m+",t="+t);
		try{
			(System.out.println("�����׳�i/o�쳣"));
			throw new java .io.IOException("���ǹ����");	//�����׳��쳣
			//System.out.println("���������϶�û�취ִ�У�����ע�ͣ�����������");
		}	
		catch(java.io.IOException e){
		System.out.println("�����쳣��"+e.getMessage);
		}
	}
}