package Week1Day2Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Welcome to Chennai";
	int count = 0;
	char repeatingchar = 'e';
	char strarray[] = str.toCharArray();
	for(int i=0 ; i<strarray.length ; i++) {
		if(strarray[i] == repeatingchar) {
			count++;
		}
		
	}
		System.out.println("The character " + repeatingchar + " has occured " + count + " times");	
	}

}
