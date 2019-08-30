package collections;

public class GenericMethodTest 
{
	public static <E> void printArray(E[] inputArray)
	{
		for(E element:inputArray) 
		{
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H', 'E', 'L', 'L', 'O'};
		System.out.println("array integerArray contains");
		printArray(intArray);
		System.out.println("array doubleArray contains");
		printArray(doubleArray);
		System.out.println("array characterArray containing");
		printArray(charArray);
	}
}