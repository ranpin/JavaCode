public class TiXing{
	double above,bottom,height;
	TiXing (double a,double b,double c){	//构造方法
		above = a;
		bottom = b;
		height = c;
	
	}

	double getArea(){
		return (above+bottom)*height/2;
	
	
	}

}