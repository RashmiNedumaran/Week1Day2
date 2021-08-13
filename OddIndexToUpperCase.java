package Week1Day2Assignment;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "hellotestleaf";
			char[] strarray = str.toCharArray();
			for(int i=0 ; i<str.length() ; i++) {
				if(i%2 ==0) {
					char uppercase = Character.toUpperCase(strarray[i]);
					System.out.print(uppercase);
				}
				else { 
					System.out.print(strarray[i]);
				}
			}
		}

	}
