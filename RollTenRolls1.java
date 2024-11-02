// Question 5
public class RollTenRolls1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int dice = (int) (Math.random() * 6) + 1;
            sum += dice;
        }
        System.out.println("The sum of 10 dice rolls is " + sum);
    }
}

