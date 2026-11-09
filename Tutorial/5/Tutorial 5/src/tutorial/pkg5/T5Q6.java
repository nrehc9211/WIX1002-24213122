package tutorial.pkg5;
import java.util.Random;
public class T5Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        int temp = random.nextInt(256);
        System.out.println("Random number between 0 and 255: " + temp);

        int[] binaryArray = new int[8];

        for(int i = binaryArray.length - 1; i >= 0; i--){
            binaryArray[i] = temp % 2;
            temp /= 2;
        }
        System.out.print("Binary representation: ");
        for(int bit: binaryArray){
            System.out.print(bit);
        }
        System.out.println();
    }
}
