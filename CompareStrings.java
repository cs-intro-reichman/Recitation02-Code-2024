// Question 9, Expansion 1
public class CompareStrings {
	public static void main(String[] args){
		String firstString = args[0];         
	 	String secondString = args[1]; 
		boolean foundAns = false;
		int res = 0; // Assume Equlity
		
		// Check common length chars 
		int minLength = Math.min(firstString.length(), secondString.length()); 
		for (int i = 0; i < minLength && !foundAns; i++){
			if (firstString.charAt(i) != secondString.charAt(i)) {
				res = firstString.charAt(i) > secondString.charAt(i) ? -1 : 1;
				foundAns = true;
			}
		}
		// If length is not equal, decide by length
		if (!foundAns && firstString.length() != secondString.length()) {
			res = firstString.length() > secondString.length() ? -1 : 1;
		}
		System.out.println(res);	
	}
}