//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for (int c: list) {
			total += c;
		}
		return total;
	}

	public double getAvg(  )
	{
		double total = 0;
		for (int c: list) {
			total += c;
		}
		double avg = total/list.size();
		return avg;
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		for (int c: list) {
			if (c > largest) {
				largest = c;
			}
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
		for (int c: list) {
			if (c < smallest) {
				smallest = c;
			}
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}