import java.util.Scanner;

public class ExceptionHandling
{
    public void checkAge(int age) throws InvalidAgeException
    {
        if (age<18)
        {
            InvalidAgeException ageException=new InvalidAgeException("Invalid Age");
            throw ageException;
        }

        else
            System.out.println("Valid age");
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling=new ExceptionHandling();
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        age=scanner.nextInt();
        try {
            exceptionHandling.checkAge(age);
        }

        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("In Finally Block");
        }
    }
}
