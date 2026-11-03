import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = input.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = input.nextInt();
        double M = (P * i/(12*100) / (1-(Math.pow(1 + i/(12*100), -N))));

        String formathead = "%-6s %15s %15s %15s %18s %15s%n";
        String formatrow = "%5d %15.2f %15.2f %15.2f %18.2f %15.2f%n";
        System.out.printf(formathead, "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double TotalInterest = 0;
        for(int n = 1; n <= N; n++){
            double C = M*(Math.pow(1+i/(12*100), -(1+N-n)));
            double L = M-C;
            double R = L/(i/(12*100))-C;
            TotalInterest += L;
            System.out.printf(formatrow, n, M, C, L, R, TotalInterest);
        }

        
    }
}
