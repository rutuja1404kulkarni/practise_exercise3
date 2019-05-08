import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumber
{
    int [] number;
    Scanner scanner=new Scanner(System.in);
    public void checkNumber() {
        number = new int[7];
        System.out.println("Enter 7 numbers");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        boolean flag = false;

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        for (int i = 1; i < number.length; i++) {
            if ((number[i] - number[i - 1]) == 1)
            {
                flag = true;
            }
           else
            {
                flag=false;
                break;
            }

        }

        System.out.println(flag);

        if(flag)
            System.out.println("Numbers are consecutive...");
        else
            System.out.println("Numbers are not consecutive...");
    }


    public static void main(String[] args) {
        ConsecutiveNumber number=new ConsecutiveNumber();
        number.checkNumber();
    }
}
