// Question 11
public class FindCharInString1 {
    public static void main(String[] args){
        String source = args[0]; 
        char chr = args[1].length() > 0 ? args[1].charAt(0) : ' '; 
        
        String printingLineStart = "Find the char: " + chr + " in the string: "; 
        printingLineStart += source;

        System.out.println(printingLineStart);

        int result = -1; // if index not found return -1 as error control
        
        for (int index = 0; index < source.length(); index++){         
            if (chr == source.charAt(index)){
                result = index;
                break;
            }
        }
		System.out.println(result);
	}
}

