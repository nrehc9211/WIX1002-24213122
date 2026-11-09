package tutorial.pkg5;
import java.util.Scanner;
public class T5Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int count = 0;

        for(int i=0; i<words.length; i++){
            if(words[i].equals("the")){
                count++;
            }
        }
        System.out.println("Number of occurrences of 'the': " + count);
    }
}
