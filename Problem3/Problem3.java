import java.util.ArrayList;

public class Problem3 {
    static ArrayList<Double> primes = new ArrayList<Double>();
    public static void main(String[] args){
            double number = Double.parseDouble(args[0]);
            double maxPrime = 0;
            
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    number = number / i;
                    // check if there exist duplicates of current number
                    i = i-1;
                }
            }
            if(number > maxPrime){
                maxPrime = number;
            }
            // int gives nicer output.
            System.out.println("Largest prime: " + (int)maxPrime);
    }
}
