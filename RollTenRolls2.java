// Question 5, Expansion 1
public class RollTenRolls2 {
    public static void main(String[] args) {
        boolean shouldPrint = Boolean.parseBoolean(args[0]);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int dice = (int) (Math.random() * 6) + 1;
            sum += dice;// sum = sum + dice 
            if (shouldPrint) {
                System.out.println("Roll " + i + ": " + dice);
            }
        }
        System.out.println("The sum of 10 dice rolls is " + sum);
    }
}
