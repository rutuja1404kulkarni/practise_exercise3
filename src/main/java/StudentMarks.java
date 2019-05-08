import java.util.Scanner;

public class StudentMarks
{
    int numOfStudents;
    int[] studGrades;
    int grade;
    Scanner scanner=new Scanner(System.in);
    public void StudentGrades()
    {
        System.out.println("Enter number of STudent");
        numOfStudents=scanner.nextInt();
        studGrades=new int[numOfStudents];

        for (int i=0;i<studGrades.length;i++)
        {
            System.out.println("Enter the Marks of Student"+i+":-");
            studGrades[i]=scanner.nextInt();

            if (studGrades[i]< 0 || studGrades[i] > 100)
            {
                System.out.println("Please Enter the number between 0 to 100");
            }
        }
    }

    public static void main(String[] args) {
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.StudentGrades();
    }
}
