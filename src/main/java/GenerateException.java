import java.util.Arrays;
import java.util.Scanner;

public class GenerateException {
    public void checkException()  {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size= scanner.nextInt();
        try {
            array = new int[size];
            System.out.println("Enter the numbers in array");
            for (int i=0;i<size;i++)
            {
                array[i]=scanner.nextInt();
            }
            System.out.println(Arrays.toString(array));

            System.out.println("Enter the position of the array you want to access");
            int position=scanner.nextInt();
            if (position>size)
            {}
            else {
                System.out.println("Number in given position of array " + array[position]);
            }

            System.out.println("Initialising array to null and trying to compare it with a value");
            int arr[] = null;
            if (arr[0] == 30)
            {}
        }

        catch (NegativeArraySizeException e) {

            System.out.println(e);
        }


        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        GenerateException generateException=new GenerateException();
        generateException.checkException();


    }
}
