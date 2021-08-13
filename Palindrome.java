package Week1Day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "MADAM";
String rev = "";
for(int i = str.length()-1 ; i >= 0 ;i--) {
	rev = rev + str.charAt(i);
}
	if(str.equalsIgnoreCase(rev)) {
		System.out.println("The string " + rev + " is palindrome");
	}
	else {
		System.out.println("The string " + rev + " is not palindrome");
	}
}
}

