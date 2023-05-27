public class Example4_8{
	public static void main(String args[]){
		Circle circle = new Circle();
		circle.setRadius(10);
		Circular circular = new Circular();
		circular.setHeight(5);
		circular.setBottom(circle);
		System.out.println("Ô²×¶Ìå»ýÎª£º"+circular.getVolme());
	
	
	}


}