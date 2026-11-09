package tutorial.pkg5;

public class T5Q2 {
    public static void main(String[] args) {
        System.out.println("a. ");
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

        System.out.println("b. ");
        int[] num = new int[10];
        int sum =0;
        for(int k = 0; k < num.length; k++){
            num[k] = k + 1;
            sum+=num[k];
        }
        System.out.println("Sum of array elements: " + sum);

        System.out.println("c. ");
        int [][]t = new int[3][3];
        t[1][2]=5;

        System.out.println("Value at t[1][2]: " + t[1][2]);

        System.out.println("d. ");
        int i =4;
        int[] score = new int[5];
        score[1]=78;
        score[i++]=100;
       
    }
}
