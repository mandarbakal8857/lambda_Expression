package com.bridgelabs;

public class Maths
{
	public static void main(String[] args)
	{
		ImathsFunc imathsFunc1=(a,b)->(a+b);
		System.out.println("Addition:"+imathsFunc1.performedOperation(12, 4));
		
		 ImathsFunc imathsFunc2=(a,b)->(a*b);
			  System.out.println("Multiplication:"+imathsFunc2.performedOperation(12, 3));
			  
			  ImathsFunc imathsFunc3=(a,b)->(a/b);
			  System.out.println("Division:"+imathsFunc3.performedOperation(12, 3));

			  
			  ImathsFunc imathsFunc4=(a,b)->(a*b);
			  System.out.println("Substraction:"+imathsFunc4.performedOperation(12, 3));
			  
			  ImathsFunc.printResult(3, 4, "Addition", imathsFunc1);
			  
			  ImathsFunc.printResult(3, 4, "Multiplication", imathsFunc2);
			  
			  ImathsFunc.printResult(12, 4, "Division", imathsFunc3);
			  
			 
		
		
		  
		 
		
	}	
	
		
	
	
   
	

}
