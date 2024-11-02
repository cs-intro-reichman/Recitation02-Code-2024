// Question 6
public class RopesAndLadders {
    public static void main(String[] args) {
        int dice = 0;
        int rolls = 0;
        int position = 0;
        while (position < 100) {
            dice = (int) (Math.random() * 6) + 1;
            rolls++;
            position += dice;
            if (position == 4) {
                position = 14;
            } else if (position == 9) {
                position = 31;
            } else if (position == 17) {
                position = 7;
            } else if (position == 20) {
                position = 38;
            } else if (position == 28) {
                position = 84;
            } else if (position == 40) {
                position = 59;
            } else if (position == 87) {
                position = 24;
            } else if (position == 93) {
                position = 53;
            } else if (position == 95) {
                position = 75;
            } else if (position == 99) {
                position = 18;
            } else {
                position = position;
            }
        }
        System.out.println("You won after " + rolls + " rolls!");
    }    
}
