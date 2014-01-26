import java.util.ArrayList;

public class Problem3 {
    static ArrayList<Double> primes = new ArrayList<Double>();
    public static void main(String[] args){
            double number = Double.parseDouble(args[0]);
            double maxPrime = 0;
            
            for(int i = 2; i < number; i++){
                iterations = iterations + 1;
                if(number % i == 0){
                    number = number / i;
                }
            }
            if(number > maxPrime){
                maxPrime = number;
            }
            // int gives nicer output.
            System.out.println("Largest prime: " + (int)maxPrime);
    }
}
