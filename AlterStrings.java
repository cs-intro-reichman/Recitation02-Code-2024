// Question 10
public class AlterStrings {
	public static void main(String[] args){
		String original = args[0];
	    String res = ""; // "" is neutral to concat in Strings        
		for (int index = 0; index < original.length(); index++){
			char chr = original.charAt(index);
			res += chr == 'm' ? 'P' : chr;
	
		}
		System.out.println(res);
	}
}
