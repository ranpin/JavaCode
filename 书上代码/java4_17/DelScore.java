package java4_17;

import java.util.Arrays;
public class DelScore{
	ComputerAver computer;
	DelScore(ComputerAver computer){
		this.computer = computer;

	}
	public void doDelete(double a[]){
		Arrays.sort(a);
		System.out.println("ȥ��һ����߷֣�"+a[a.length-1]);
		System.out.println("ȥ��һ����ͷ֣�"+a[0]);
		double b[] = new double[a.length-2];
		for(int i=1;i<a.length-1;i++){
			b[i-1]=a[i];
		
		}
		computer.giveAver(b);
	
	
	
	
	}

} 