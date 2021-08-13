package Week1Day2Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("The second largest numbers :" + data[data.length -2]);
		
	}

}
