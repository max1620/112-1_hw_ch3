package hw_ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34_P36_P37_P38_P40_P43 {

/*
	public static void main(String[] args)throws IOException	//P34
	{
		System.out.println("請輸入一個整數");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		
		System.out.println("您輸入的數字是"+num);
	}
*/
	
/*	
	public static void main(String[] args)	//P36
	{
		String str1 = "Hello";

		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(1);
		
		int len = str1.length();
		
		System.out.println(str1+"的第一個字元是"+ch1);
		System.out.println(str1+"的第二個字元是"+ch2);
		System.out.println(str1+"的長度是"+len);
	}
*/
	
/*	
	public static void main(String[] args)throws IOException	//P37
	{
		System.out.println("請輸入英文字母");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();

		String stru = str1.toUpperCase();
		String strl = str1.toLowerCase();
		
		System.out.println("轉換大寫時為"+stru);
		System.out.println("轉換小寫時為"+strl);
	}
*/
	
/*	
	public static void main(String[] args)throws IOException	//P38
	{
		System.out.println("請輸入字串");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();

		System.out.println("請輸入要檢索的文字");
		
		String str2 = br1.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1)	//搜不到回傳-1
			System.out.println(str1+"的第"+(num+1)+"個字就是「"+ch+"」");
		else
			System.out.println(str1+"中沒有「"+ch+"」這個字");
	}
*/
	
/*
	public static void main(String[] args)throws IOException	//P40
	{
		System.out.println("請輸入字串");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();

		System.out.println("請輸入要新增的字串");
		
		String str2 = br1.readLine();

		StringBuffer sb =new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println("在「"+str1+"」後新增「"+str2+"」的話，就會變成「"+sb+"」。");
	}
*/
	
	public static void main(String[] args)throws IOException	//P43
	{
		System.out.println("請輸入兩個整數");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();	
		String str2 = br1.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		System.out.println(num1+"與"+num2+"中較大的是"+ans);
	}
}
