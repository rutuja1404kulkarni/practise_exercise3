import java.util.Scanner;

public class MatrixAddition {
    int row,col;

    Scanner scanner=new Scanner(System.in);
    public void additionOfMatrix()
    {
        System.out.println("Enter the number of rows");
        row=scanner.nextInt();
        System.out.println("Enter the number of columns");
        col=scanner.nextInt();

        int matrix1[][]=new int[row][col];
        int matrix2[][]=new int[row][col];
        int result[][]=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.println("Enter the Elements in matrix");
                matrix1[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.println("Enter the Elements in matrix");
                matrix2[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }




    }

    public static void main(String[] args) {
        MatrixAddition addition=new MatrixAddition();
        addition.additionOfMatrix();
    }
}
