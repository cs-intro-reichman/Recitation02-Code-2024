// Question 2
public class GradeCalc {
	public static void main(String[] args){
	    int score = Integer.parseInt(args[0]);         
	    char grade = '0';		      
        if (score >= 90){
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
	  System.out.println("Grade = " + grade);
	}
}
