import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = Integer.MAX_VALUE;
        int num = rand.nextInt(max);
        int digit = 0;
        while(num>0){
            digit++;
            num/=10;
        }
        System.out.println("The number of digits is: "+digit);
    }
}