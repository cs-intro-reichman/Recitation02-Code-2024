// Question 1
public class DoubleDiceRoll {
    public static void main(String[] args){
        int dice1 = (int)((Math.random() * 6) + 1);
        int dice2 = (int)((Math.random() * 6) + 1);
        if (dice1 == dice2){
            System.out.println("You rolled a double " + dice1 + "!!");
        } else { 
            System.out.println("You rolled " + dice1 + " and " + dice2);
       }
    }
}


