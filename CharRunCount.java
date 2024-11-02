// Question 9
public class CharRunCount {
	public static void main(String[] args){
	    String word = args[0];
		char ch = args[1].charAt(0); 
		int count = 0; 
	    for (int i = 0; i < word.length(); i++){         
            if (word.charAt(i) == ch){
                count++;
            }
		}
        System.out.println("the char: " + ch + " appears " + count + " times in the word: " + word);
    }
}
        
 



