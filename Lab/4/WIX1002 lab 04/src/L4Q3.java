import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        double sum = 0,n=0;
        while(true){
            System.out.print("Enter a score [negative to quit]:");
            score = input.nextInt();
            if(score<0){
                break;
            }
            if(score < min){
                min = score;
            }
            if(score > max){
                max = score;
            }
            sum+=score;
            n++;
        }

        System.out.println(" ");
        System.out.printf("%.1f%n",sum);
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        double average = sum/n;

        double sd = Math.sqrt((sum*sum-(sum*sum/n))/(n-1));
        System.out.printf("Average Score:%.2f%n", average);
        System.out.printf("Standard Deviation:%.2f%n", sd);

    }
}
