public class Example4_13{
	public static void main(String args[]){
		Circle circle = new Circle();
		circle.setRadius(196.87);
		
		TiXing lader = new TiXing(3,21,9);
		Student zhang= new Student();
		
		System.out.println("zhang����Բ�����");
		double result= zhang.computerArea(circle);
		System.out.println(result);
		
		System.out.println("zhang�������ε����");
		result= zhang.computerArea(lader);
		System.out.println(result);
		
		
	
	
	}


}