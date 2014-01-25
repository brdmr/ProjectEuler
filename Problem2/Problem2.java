public class Problem2{

    public static void main(String[] args){
        
        int temp, res = 2,a = 1, b = 2;
        while(b <= 4000000){
            temp = a+b;
            a = b;
            b = temp;
            if(temp % 2 == 0){
                res = res + temp;
            }
        }
        System.out.println("The answer is: " + res);
    }
}
