package Week1Day2Assignment;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arrnumber = {3,8,9,6,4,5};
Arrays.sort(arrnumber);
System.out.println("The numbers in Array after sorting" + arrnumber);
System.out.println("The second largest number in the array"+ arrnumber [arrnumber.length- 2]);
	}
}
