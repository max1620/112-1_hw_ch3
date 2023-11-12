package hw_ch3;

class Car3
{
public static int sum=0;	//類別變數

	private int num;
	private double gas;
	
	public Car3()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}

	public static void showSum()	//類別方法
	{
		System.out.println("車子總共有"+sum+"台");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

public class P31 {
	
	public static void main(String[] args)	//P31
	{
		Car3.showSum();
		
		Car3 car1 = new Car3();
		car1.setCar(1234, 21.3);
		
		Car3.showSum();
		
		Car3 car2 = new Car3();
		car2.setCar(4567, 30.4);
		
	}

}
