class Bird{
	public String color;
	public double weight;
	void fly(){
		System.out.println("пн~");
	
	}
}
class tuoNiao extends Bird{
	int weight;
	void fly(){
		System.out.println("I can't fly");
	}	
}
public class tuoniaoTest{
	public static void main(String args[]){
	tuoNiao tuoniao = new tuoNiao();
	tuoniao.color="blue";
	tuoniao.weight=3;
	tuoniao.fly();
}
}