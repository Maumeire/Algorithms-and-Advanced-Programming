/*
Algorithms and Advanced Prgraming
Meire de Jesus Torres
28/01/2022
intantible
*/
import java.util.Random;
	class LabOneQuestions{

			public LabOneQuestions()
			{
			}

			public int returnLargest(int number1, int number2)
			{

			//create a statement
				if(number1 >= number2){
					return number1;
				}
				else{
					return number2;
				}
			}

		public int getLargestNum(int[]myArray)
		{

				int largest = myArray[0];

				for(int indexNumber=0;indexNumber<myArray.length; indexNumber++)
				{

					if(myArray[indexNumber]>largest)
					{
						largest = myArray[indexNumber];
					}
				}
				return largest;
		}


		public int getLargestFromRandomArray()
		{

				Random randomGenerator = new Random();

				int[]numbers = new int[1000];

				for(int i=0;i<1000; i++)
				{

					numbers[i] = randomGenerator.nextInt(800);
				}
						int largest = getLargestNum(numbers);


				return largest;
		}

	}
