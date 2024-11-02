// Question 13, Expansion 1
public class CompareStrings {
		public static void main(String[] args){
			String a = args[0];         
 		    String b = args[1]; 
            boolean ans = true;
			int res = -2 ;
			for (int i = 0; i < a.length() && ans; i++){
			    ans = (a.charAt(i) == b.charAt(i));
			    if (!ans) {
				    res = a.charAt(i) > b.charAt(i) ? -1 : 1;
			    }
			}
			if (a.length() != b.length()) {
		        res = a.length() > b.length() ? -1 : 1;
            } else {
			    res = 0;
			}
            System.out.println(res);
		}
}

