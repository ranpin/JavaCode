package java4_17;

import java.util.Scanner;
public class InputScore{
	DelScore de1;
	InputScore(DelScore de1){
		this.de1 = de1;
	}
	
	public void inputScore(){
		System.out.println("��������ί����");
		Scanner read = new Scanner(System.in);
		int count = read.nextInt();
		System.out.println("���������ί������");
		double a[]=new double[count];		//���������Լ���������
		for(int i=0;i<count;i++){
			a[i]=read.nextDouble();
		
		}
		de1.doDelete(a);
	
	}
}