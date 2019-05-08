import java.util.Scanner;

public class ChessBoard {
    int row=8,col=8;
    int [][] chess;
    public void display()
    {
        chess=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if(((i+j) %2)==0)
                {
                    System.out.print("WW");
                }
                else System.out.print("BB");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.display();
    }
}
