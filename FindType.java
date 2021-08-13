package Week1Day2Assignment;

public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd class of automation $$ ";
		int letter = 0,space = 0,num=0,specialchar=0;
		char chararray[] = test.toCharArray();
		for(int i=0; i<chararray.length;i++) {
			if(Character.isLetter(chararray[i])) 
			{
				letter++;
			}
			else if(Character.isDigit(chararray[i])) 
			{
				num++;
			}
			else if(Character.isSpaceChar(chararray[i])) 
			{
				space++;
			}
			else {
				specialchar++;
			}
		}
		System.out.println("The number of letters "+ letter);
		System.out.println("The number of space "+ space);
		System.out.println("The number of num "+ num);
		System.out.println("The number of specialchar "+ specialchar);
		
	}

}
