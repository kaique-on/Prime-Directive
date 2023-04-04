import java.util.ArrayList;
public class PrimeDirective {
    public boolean isPrime(int number) {
        if (number == 2) {
            System.out.println("Menor numero primo");
            return true;
        } else if (number < 2) {
            System.out.println("Não é primo");
            return false;
        }
        for (int i = 2; i < number ; i++) {
            if (number%i == 0) {
                System.out.println("Nao e primo");
                return false;
            }
          }
          System.out.println("E primo");
          return true;
    }

    public void onlyPrime(ArrayList<Integer> number) {
        ArrayList<Integer> primes = new ArrayList<Integer>(); 
    }
    
    public static void main(String[] args) {
        PrimeDirective prime = new PrimeDirective();
        
        prime.isPrime(47);
    }
}