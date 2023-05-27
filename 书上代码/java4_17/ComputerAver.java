package java4_17;

public class ComputerAver{
	public void giveAver(double b[]){
	double sum = 0;
	double aver;
	for(int i=0;i<b.length;i++){
		sum=sum+b[i];
	
	}
	aver = sum/b.length;
	System.out.println("选手最后得分"+aver);
	}

}