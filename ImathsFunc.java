package com.bridgelabs;

@FunctionalInterface
public interface ImathsFunc
{
	int performedOperation(int a,int b);
	
	static void printResult(int a,int b,String function,ImathsFunc ob)
	{
		System.out.println("Result:"+ob.performedOperation(a, b));
	}

}
