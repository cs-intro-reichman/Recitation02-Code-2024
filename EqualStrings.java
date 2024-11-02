// Question 9
public class EqualStrings {
    public static void main(String[] args){
        String a = args[0];         
 		String b = args[1]; 
        boolean ans = a.length() == b.length();
        for (int i = 0; i < a.length() && ans; i++){
            ans = (a.charAt(i) == b.charAt(i));
        }
        System.out.println(ans);
    }
}
