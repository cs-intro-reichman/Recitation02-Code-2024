public class CompareStringsBad {
	public static void main(String[] args){
		String a = args[0];         
	 	String b = args[1]; 
		boolean foundAns = false;
		int res = 0; // Assume Equlity
		
		// Check common length chars
		for (int i = 0; i < a.length() && !foundAns; i++){
			if (a.charAt(i) != b.charAt(i)) {
				res = a.charAt(i) > b.charAt(i) ? -1 : 1;
				foundAns = true;
			}
		}
		// If length is not equal, decide by length
		if (!foundAns && a.length() != b.length()) {
			res = a.length() > b.length() ? -1 : 1;
		}
		System.out.println(res);	
	}
}

