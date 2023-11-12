package hw_ch3;

//Car類別 P14,P15,P16,P17,P20
class Car1
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNum(int n) 
	{
	num = n;
	System.out.println("將車號設為"+num);
	}
	
	void setGas(double g) 
	{
	gas = g;
	System.out.println("將汽油量設為"+gas);
	}
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

public class P14_P15_P16_P17_P20 {
	
/*
	public static void main(String[] args)	//P14
	{
		Car1 car1 = new Car1();
	
		car1.setNum(1234);
		car1.setGas(20.6);
	}
*/
	
/*
	public static void main(String[] args)	//P15
	{
		Car1 car1 = new Car1();
	
		int number = 1234;
		double gasoline = 29.4;
		
		car1.setNumGas(number, gasoline);
	}
*/
	
/*
	public static void main(String[] args)	//P17
	{
		Car1 car1 = new Car1();
		car1.setNumGas(1234, 29.3);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+"，汽油量是"+gasoline);
	}
*/
	
	
	public static void main(String[] args)	//P20
	{
		Car1 car1 = new Car1();
		
		car1.num = 1234;
		car1.gas = -10.0;
		car1.show();
	}
	
}
