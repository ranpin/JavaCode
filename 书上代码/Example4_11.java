import java.util.*;
public class Example4_11{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a[]={12,34,9,23,45,6,45,90,123,19,34};
		Arrays.sort(a);		//先排序
		System.out.println(Arrays.toString(a));
		System.out.println("输入整数，程序判断该整数是否在数组中");
		int number = scanner.nextInt();
		int index = Arrays.binarySearch(a,number);	//再利用二分法
		if(index >= 0)
			System.out.println(number+"和数组中索引为"+index+"的元素相同");
		else System.out.println(number+"不与数组中任何元素的值相同");
		
	}

}