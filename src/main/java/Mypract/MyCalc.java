package Mypract;

public class MyCalc {
	public int sum(int a , int b)
	{
		return a*b;
	}
	public static void main(String []args)
	{
		MyCalc myCalc=new MyCalc();
		System.out.println("Sum:"+myCalc.sum(10, 20));
	}
}
