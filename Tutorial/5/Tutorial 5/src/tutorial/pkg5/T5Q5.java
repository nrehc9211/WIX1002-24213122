package tutorial.pkg5;

import java.util.Scanner;

public class T5Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        int left = 0;
        int right = words.length-1;

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed sentence: ");
        for(String word:words){
            System.out.print(word + " ");
        }
    }
}
