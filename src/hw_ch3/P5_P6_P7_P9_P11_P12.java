package hw_ch3;

//Car類別 P5,P6,P7,P9,P11,P12
class Car
{
	int num;
	double gas;
	
	void show() 
	{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
	}
	
	void showCar() 
	{
	System.out.println("開始顯示車子資料");
	this.show();
	}
}


public class P5_P6_P7_P9_P11_P12 {
	
/*
	public static void main(String[] args)	//P5
	{
		Car car1;
		car1 = new Car();
	}
	
*/
	
/*
	public static void main(String[] args)	//P6
	{
		Car car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.55;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}	
	
*/
	
/*
	public static void main(String[] args)	//P7
	{
		Car car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.55;
		
		Car car2 = new Car();
		
		car2.num = 2345;
		car2.gas = 30.2;
		
		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);
		
		System.out.println("car2車號是"+car2.num);
		System.out.println("car2汽油量是"+car2.gas);
	}
*/
	
/*
	public static void main(String[] args)	//P9
	{
		Car car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.55;
	}	
*/
	
/*
	public static void main(String[] args)	//P11
	{
		Car car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.55;
		
		car1.show();
		car1.show();
	}
*/	
	
	
	public static void main(String[] args)	//P12
	{
		Car car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.55;
		
		car1.showCar();
	}
}