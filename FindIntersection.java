package Week1Day2Assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*arr1 = {3,2,11,4,6,7};
 * arr2 = {1,2,8,4,9,7};
 * for loop 0 to array length
 * nested for loop for another array
 * compare both array using condition statement
 * print the first array (should match item in both array)  
 */
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		for (int i = 0; i <=arr1.length-1 ; i++) {
			for (int j = 0; j <=arr2.length-1 ; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
