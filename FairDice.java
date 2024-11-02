// Question 7 
public class FairDice {
    public static void main(String[] args){
        int times = Integer.parseInt(args[0]);
        int sum = 0; 	// variable to store answer,
                        // initialized to 0 since 0 is neutral to
                        // addition (number + 0 == number)
   
        for (int i = 0; i < times; i++){
            int dice = 0;
            int count = 0;
            while (dice != 6) {
               dice = (int)(Math.random() * 6 + 1);
               count++;
            }
            sum = sum + count;
        }
       System.out.println((double) sum / times);
     }
}
