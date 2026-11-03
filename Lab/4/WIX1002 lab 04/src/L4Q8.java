import java.util.Scanner;
public class L4Q8 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number(0 to 100): ");
        int num = input.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=num;i++){
            isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i > 1){
                System.out.print(i + ", ");
            }
        }
    }
}
