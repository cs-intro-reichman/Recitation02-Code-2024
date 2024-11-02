// Question 13
public class AllIndexOf {
    public static void main(String[] args) {
        // Q10 - charRunCount 
        String word = args[0];
        char ch = args[1].charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("the char: " + ch + " appears " + count + " time in the word:" + word);
        
        // Q12 - FindCharInString (with some adjustments)
        String temp = "Find all appearnces of the char: " + ch + "in the string: " + word; 
        System.out.println(temp);

        int curCounter = 1;
        String res = "";

        for (int index = 0; index < word.length() && curCounter <= count; index++){         
            if (ch == word.charAt(index)){
                if (curCounter != 1){
                    res += ","; // Aesthetics 
               	}
                // note curCounter value increased by 1 after the following is excecuted 
                res += "(" + (curCounter) + "," + index + ")"; 
                curCounter++;
	        }
	    }
	    System.out.println(res);
    }
}

