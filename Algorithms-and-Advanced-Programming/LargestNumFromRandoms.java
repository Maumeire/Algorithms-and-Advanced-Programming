/*
Algorithms and Advanced Prgraming
Meire de Jesus Torres
28/01/2022
Instatiable
*/

		import java.util.Scanner;
		import java.lang.*;
		//Package java. lang contains the wrapper classes Boolean , Character , Integer , Long , Float ,
		//and Double serve this purpose. An object of type Double , for example, contains a field whose type
		//is double, representing that value in such a way that a reference to it can be stored in a variable of reference type.

		public class LargestNumFromRandoms {

			public static void main(String args[]) {




				//create a instance this allowed to get inform from other class
				   LabOneQuestions l1q = new LabOneQuestions();


					//long startTime and endTime define nanoseconds nanotime
				   long startTimeNano = System.nanoTime();

				   //the larger of two numbers in the array and
				   //getting some code from instatiale class l1q.getLargestFromRandomArray();
				   int largest = l1q.getLargestFromRandomArray();

				   long endTimeNano = System.nanoTime();

				   //The time it takes to run your code all depends on your algorithm, CPU speed etc.
				   long elapsedTimeNano = endTimeNano-startTimeNano;

				   System.out.println("The answer is =" + largest + " It took nanos seconds to process data " + elapsedTimeNano);
				  }

			 }
