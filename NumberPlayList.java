package com.bridgelabs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlayList {

	public static void main(String[] args) 
	{
		List<Integer>myNumberlist=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			myNumberlist.add(i);
		}
		
		Consumer<Integer>myList=n->{
			System.out.println("Method 1:forEach lambda imp value"+n);
		};
		
		 myNumberlist.forEach(n -> {
	            System.out.println("METHOD 2 : forEach Lambda impl Value :: " + n);
	        });

	        //method3: Implicit Lambda Function to print double value
	        Function<Integer, Double> toDoubleFunction = Integer::doubleValue;

	        // Function<Integer, Double> toDoubleFunction = n-> n.doubleValue;
	        myNumberlist.forEach(n -> {
	            System.out.println("METHOD 3 : forEach Lambda double Value::" +
	                    toDoubleFunction.apply(n));
	        });

	}

}
