// Question 4
public class Primes {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]); 
        boolean isPrime = num > 1; 
       
        for (int i = 2; i < num && isPrime; i++){ 
            isPrime = (num % i != 0);
        }
   
        if (isPrime){
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
   
}