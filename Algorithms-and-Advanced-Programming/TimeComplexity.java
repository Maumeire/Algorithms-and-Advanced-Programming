/*
*Meire JT
*Algorithms 1st. week
*Time complexity
*24th Jan 2022.
*/
//Compute the sum of the first N natural numbers
//Two separate functions that solve the problem are given to the right:
//Which solution is the best?

import java.util.*;
import java.lang.*;

public class TimeComplexity{

	public static void main(String [] args){

		long millis_startTime = System.currentTimeMillis();
		long nano_startTime = System.nanoTime();


		long millis_endTime = System.currentTimeMillis();
		long nano_endTime = System.nanoTime();

		//long millis_elapsedTime = (millis_endTime - millis_statTime);

	    System.out.println("Time taken in milliseconds="+ (millis_endTime - millis_startTime));
		System.out.println("Time taken in nano seconds="+ (nano_endTime - nano_startTime));

		}

							public static long sumN1(long n){
								long s = n * (n + 1/2);
								return s;
								}


}
