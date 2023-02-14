package com.bridgelabs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
	        
	        Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
	        myNumberlist.forEach(n -> {
	            System.out.println("method4: forEach value of " + n + " check for even: " + isEvenFunction.test(n));
	        });

	}

}
