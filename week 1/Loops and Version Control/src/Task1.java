import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = { -80, -25, -5, 8, 15, 50, 90, 150, 240};
        Arrays.sort(numbers);
        String listNumbers = Arrays.toString(numbers);
        System.out.println(listNumbers);
        int last = (Array.getLength(numbers) - 1);
        System.out.println("The first number is: " + numbers[0]);
        System.out.println("The last number is: " + numbers[last]);
        int diff = 0;
        if (numbers[0] <= 0){
            diff = ((numbers[0]) + numbers[last]);
        } else {
            diff = ((numbers[0]) - numbers[last]);
        }
        System.out.println("The difference between the smallest and the largest number is: " + diff);
    }
}
