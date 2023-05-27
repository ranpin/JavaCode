package java4_17;

import java.util.Scanner;
public class InputScore{
	DelScore de1;
	InputScore(DelScore de1){
		this.de1 = de1;
	}
	
	public void inputScore(){
		System.out.println("请输入评委数：");
		Scanner read = new Scanner(System.in);
		int count = read.nextInt();
		System.out.println("请输入各评委分数：");
		double a[]=new double[count];		//声明数组以及创建数组
		for(int i=0;i<count;i++){
			a[i]=read.nextDouble();
		
		}
		de1.doDelete(a);
	
	}
}