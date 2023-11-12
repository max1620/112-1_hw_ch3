package hw_ch3;

//Car類別 P22,P24,P26,P27,P28
class Car2
{
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
		}
		else 
		{
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	public Car2()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car2(int n,double g)
	{
		this();	//P28
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

public class P22_P24_P26_P27_P28{	
	
/*
	public static void main(String[] args)	//P22
	{
		Car2 car1 = new Car2();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("指定不正確的汽油量{-10.0}看看");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
	}
*/

/*
	public static void main(String[] args)	//P24
	{
		Car2 car1 = new Car2();
		
		car1.setCar(1234, 20.5);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(18.7);
		car1.show();
	}
*/
	
/*
	public static void main(String[] args)	//P26
	{
		Car2 car1 = new Car2();
		car1.show();
	}
*/	
	

	public static void main(String[] args)	//P27,P28
	{
		Car2 car1 = new Car2();
		car1.show();
		
		Car2 car2 = new Car2(1234,24.1);
		car2.show();
	}

	
}
