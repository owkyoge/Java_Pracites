package stringexample;

public class StringContainsIfElse {

	public static void main(String[] args) {
		String str1 = " Learn Java ";
		String str2 = " Java ";
		String str3 = " java ";
       Boolean result ;
		
		if (str1.contains(str2)) {
			System.out.println(str1 + "Contains" + str2);
		}
		else {
			System.out.println(str1 + "doesn't Contains" + str2);
		}
		
		if (str1.contains(str3)) {
			System.out.println(str1 + "contains" + str3);
		}
		else { 
			System.out.println(str1 + "doesn't Contains" + str3);
		}
		
	}

}
