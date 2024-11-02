// Question 5, Expansion 2
public class RollTenRolls3 {
    public static void main(String[] args) {
        boolean shouldPrint = Boolean.parseBoolean(args[0]);
        int nTimes = Integer.parseInt(args[1]);
        int sum = 0;
        for (int i = 0; i < nTimes; i++) {
            int dice = (int) (Math.random() * 6) + 1;
            sum += dice;
	        if (shouldPrint) {
		        System.out.println("Roll " + i + ": " + dice);
            }
        }
        System.out.println("The sum of " + nTimes + "dice rolls is " + sum);
    }

}
