
/**
 * Display String in reverse order word by word
 * @author panka
 *
 */
import java.util.regex.Pattern; 
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friends";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {		
			
			Pattern pattern = Pattern.compile("\\s"); 
	        String[] temp = pattern.split(input); 
	        String result = ""; 
	  
	        for (int i = 0; i < temp.length; i++) { 
	            if (i == temp.length - 1) 
	                result = temp[i] + result; 
	            else
	                result = " " + temp[i] + result; 
	        } 
	        return result; 
	}
}