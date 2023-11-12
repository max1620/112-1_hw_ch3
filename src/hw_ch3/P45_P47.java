package hw_ch3;

class Car4	//P45,P47
{
	private int num;
	private double gas;
	private String name;
	
	public Car4()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";	//P47
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為"+name);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}
public class P45_P47 {
	
/*
	public static void main(String[] args)	//P45
	{
		System.out.println("宣告car1");
		Car4 car1 = new Car4();
		car1.setCar(1234, 21.3);
		
		System.out.println("宣告car2");
		Car4 car2 = new Car4();
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		System.out.print("car1的");
		car1.show();
		
		System.out.print("car2的");
		car2.show();
		
		System.out.println("改變car1相關資料");
		car1.setCar(2345, 30.5);
		
		System.out.print("car1的");
		car1.show();
		
		System.out.print("car2的");
		car2.show();
	}
*/
	
	public static void main(String[] args)	//P47
	{
		Car4 car1 = new Car4();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 24.5;
		String str = "1號車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);

		car1.show();
	}
	
}
