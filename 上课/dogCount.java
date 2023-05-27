class Dog{
	static int i;
	int age;
	double weight;
	String type;
	void DogSpeak(){
		System.out.println("汪汪");
	}
	Dog(){

		i++;
	}
}
public class dogCount{
	public static void main(String args[]){
		Dog dog1 =new Dog();	
		dog1.age=2;
		dog1.weight=10;
		dog1.type="haba";
		dog1.DogSpeak();
		Dog dog2 =new Dog();
		Dog dog3 =new Dog();
		System.out.println("创建dog次数："+Dog.i);

	
	}

}